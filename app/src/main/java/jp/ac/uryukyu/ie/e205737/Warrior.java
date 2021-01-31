package jp.ac.uryukyu.ie.e205737;

/**
 * 戦士クラス
 */
public class Warrior extends Hero {
    /**
     * 戦士クラスのコンストラクタ
     * @param name　名前
     * @param maximumHP　最大HP
     * @param attack　攻撃力
     */
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack); 
    }
    /**
     * attackの150%を固定ダメージとして与える攻撃メソッド。
     * @param opponent 攻撃対象
     */  
    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(attack * 1.5);
        if(this.dead == false);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);

    }
}
