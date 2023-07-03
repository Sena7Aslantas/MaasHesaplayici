public class Employee {

    String name;
    Double salary;
    int workHours;
    int hireYear;
    int bonus;
    double zam;
    double vergi;
    double a;
    double toplam;


    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public void tax(){
        if(salary<=1000){
          double vergi=0;
            System.out.println("Vegi:"+vergi);

        }else{
           double vergi=salary*0.03;
            System.out.println("Vegi:"+vergi);
        }

    }

    public void bonus(){
        if(workHours>=40) {
            bonus = (workHours - 40) * 30;
            System.out.println("Bonus:" + bonus);
        }
            else{
                bonus=0;
            }

    }

    public void raiseSalary() {
        if (hireYear <=9) {
            zam = salary + (salary * 0.05);

        } else if (hireYear > 9 && hireYear < 19) {
           zam = salary + (salary * 0.10);

        } else if (hireYear >= 19) {
            zam = salary + (salary * 0.15);
        }
        System.out.println("Maaş Artışı:"+zam);

    }
    public void yazdir(){
        System.out.println("Adı:"+this.name);
        System.out.println("Maaşı:"+this.salary);
        System.out.println("Çalışma saati:"+this.workHours);
        System.out.println("Başlangıç yılı:"+this.hireYear);
        tax();
        bonus();
        raiseSalary();
         a=zam+salary-vergi;
        System.out.println("Vergi ve bonuslar ile maaş:"+this.a);
         toplam=salary+zam+bonus-vergi;
        System.out.println("Toplam Maaş:"+this.toplam);



    }
}

