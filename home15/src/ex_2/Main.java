package ex_2;

public class Main {
    public static void main(String[] args) {
        Size size32 = Size.XXS;
        Size size34 = Size.XS;
        Size size36 = Size.S;
        Size size38 = Size.M;
        Size size40 = Size.L;
        size32.getDescription();
        size34.getDescription();

        Tshort mTshort = new Tshort(size40,50.25,"RED");
        Tshort wTshort = new Tshort(size36,45.30,"Blue");
        Pants mPants = new Pants(size40,60.40,"Grey");
        Pants wPants = new Pants(size36,52.20,"Yellow");
        Skirt skirt = new Skirt(size34,35.22,"White");
        Tie tie = new Tie(size38,15.28,"Green");
        Clothes[] clothes = new Clothes[6];
        clothes[0] = mTshort;
        clothes[1] = wTshort;
        clothes[2] = mPants;
        clothes[3] = wPants;
        clothes[4] = skirt;
        clothes[5] = tie;
        Studio st = new Studio();
        st.clotheAMan(clothes);
        System.out.println();
        st.clotheAWoman(clothes);

    }
}
