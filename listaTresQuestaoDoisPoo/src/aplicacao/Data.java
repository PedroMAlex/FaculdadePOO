package aplicacao;

public class Data {
    private String dia= "01";
    private String mes= "01";
    private String ano= "0001";
    private String mesPorExtenso= " ";

    public Data() {

    }

    public String getDia(){
        return dia;
    }

    public void setDia(String dia){
        this.dia=dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMesPorExtenso() {
        return mesPorExtenso;
    }

    public void setMesPorExtenso(String mesPorExtenso) {
        this.mesPorExtenso = mesPorExtenso;
    }

    public Data(String dia, String mes, String ano) {
        int diaInt, mesInt, anoInt;

        try {
            diaInt = Integer.parseInt(dia);
            mesInt = Integer.parseInt(mes);
            anoInt = Integer.parseInt(ano);

            if (anoInt >= 1 && anoInt <= 2024) {
                if (mesInt >= 1 && mesInt <= 12) {
                    int maxDias = 31;  // Inicializa com um valor padrão

                    // Verifica quantos dias o mês possui
                    if (mesInt == 4 || mesInt == 6 || mesInt == 9 || mesInt == 11) {
                        maxDias = 30;
                    } else if (mesInt == 2) {
                        maxDias = (anoInt % 4 == 0 && (anoInt % 100 != 0 || anoInt % 400 == 0)) ? 29 : 28;
                    }

                    if (diaInt >= 1 && diaInt <= maxDias) {
                        this.dia = dia;
                        this.mes = mes;
                        this.ano = ano;
                    } else {
                        System.out.println("Dia inválido para o mês especificado.");
                    }
                } else {
                    System.out.println("Mês inválido. Deve estar entre 1 e 12.");
                }
            } else {
                System.out.println("Ano inválido. Deve estar entre 1 e 2024.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Valores de dia, mês ou ano não são números inteiros válidos.");
        }
    }
    public int compara(Data data) {
        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);

        int diaUsuario = Integer.parseInt(data.getDia());
        int mesUsuario = Integer.parseInt(data.getMes());
        int anoUsuario = Integer.parseInt(data.getAno());

        if (anoInt > anoUsuario) {
            return 1;
        } else if (anoInt < anoUsuario) {
            return -1;
        } else {
            if (mesInt > mesUsuario) {
                return 1;
            } else if (mesInt < mesUsuario) {
                return -1;
            } else {
                if (diaInt > diaUsuario) {
                    return 1;
                } else if (diaInt < diaUsuario) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public Object clone(){
        Data dataClone = new Data(dia,mes,ano);
        return dataClone;
    }
}
