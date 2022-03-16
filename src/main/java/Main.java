public class Main {

    public static void main(String[] args) {
        Warrior_1 war_1 = new Warrior_1("Воїн_1", 1000, "ніж", 200);
        Warrior_2 war_2 = new Warrior_2("Воїн_2", 800, "шабля", 300);
        Warrior_3 war_3 = new Warrior_3("Воїн_3", 500, "пістолет", 500);

        war_1.voin();
        war_2.voin();
        war_3.voin();

        System.out.println("БИТВА !!!!!!" + '\n');

        String n1 = war_1.getFname();
        String n2 = war_2.getFname();
        String n3 = war_3.getFname();

        int x = war_1.getHp();
        int x1 = war_1.getDamag();
        int y = war_2.getHp();
        int y1 = war_2.getDamag();
        int c = war_3.getHp();
        int c1 = war_3.getDamag();

        for(int i=0; i<20; i++) {
            if (x > 0 || y > 0 || c > 0) {

                int k = (int) (Math.random() * 5);

                switch (k) {
                    case 0:
                        if (y <= 0) {
                            break;
                        } else {
                            if (x > 0) {

                                x = x - y1;
                                System.out.println(n2 + " поцілив у " + n1 + '\n' + n1 + " hp: " + x + '\n');
                                if(0>=x){
                                    System.out.println(n1 + ": помер!" + '\n');
                                }
                                break;
                            }
                        }

                    case 1:
                        if (c <= 0) {
                            break;
                        } else {
                            if (x > 0) {
                                x = x - c1;
                                System.out.println(n3 + " поцілив у " + n1 + '\n' + n1 + " hp: " + x + '\n');
                                if(0>=x){
                                    System.out.println(n1 + ": помер!" + '\n');
                                }
                                break;
                            }
                        }
                    case 2:
                        if (x <= 0) {
                            break;
                        } else {
                            if (y > 0) {
                                y = y - x1;
                                System.out.println(n1 + " поцілив у " + n2 + '\n' + n2 + " hp: " + y + '\n');
                                if(0>=y){
                                    System.out.println(n2 + ": помер!" + '\n');
                                }
                                break;
                            }
                        }
                    case 3:
                        if (c <= 0) {
                            break;
                        } else {
                            if (y > 0) {
                                y = y - c1;
                                System.out.println(n3 + " поцілив у " + n2 + '\n' + n2 + " hp: " + y + '\n');
                                if(0>=y){
                                    System.out.println(n2 + ": помер!" + '\n');
                                }
                                break;
                            }
                        }
                    case 4:
                        if (x <= 0) {
                            break;
                        } else {
                            if (c > 0) {
                                c = c - x1;
                                System.out.println(n1 + " поцілив у " + n3 + '\n' + n3 + " hp: " + c + '\n');
                                if(0>=c){
                                    System.out.println(n3 + ": помер!" + '\n');
                                }
                                break;
                            }
                        }
                    case 5:
                        if (y <= 0) {
                            break;
                        } else {
                            if (c > 0) {
                                c = c - y1;
                                System.out.println(n2 + " поцілив у " + n3 + '\n' + n3 + " hp: " + c + '\n');
                                if(0>=c){
                                    System.out.println(n3 + ": помер!" + '\n');
                                }
                                break;
                            }
                        }
                    default:
                        break;
                }
            }
        }
        if(x > (0)) {
            if(x>0) {
                System.out.println("Битва закінчилася! Виграв -> " + n1);
                System.exit(0);
            }
        } else
        if(y > (0)) {
            if(y>0) {
                System.out.println("Битва закінчилася! Виграв -> " + n2);
                System.exit(0);
            }
        } else
        if(c >(0)) {
            if(c>0) {
                System.out.println("Битва закінчилася! Виграв -> " + n3);
                System.exit(0);
            }
        }
    }
}
