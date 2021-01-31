package jp.ac.uryukyu.ie.e205737;

//import jdk.tools.jlink.resources.plugins;

/**
 * 生物クラス。
 *  String name; //生物の名前
 *  int hitPoint; //生物のHP
 *  int attack; //生物の攻撃力
 *  boolean dead; //生物の生死状態。true=死亡。
 */
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param _name 生物名
     * @param maximumHP 生物のHP
     * @param _attack 生物の攻撃力
     */
    public LivingThing(String _name,int maximumHP, int _attack){
        //System.out.println("LivingThingsクラスのコンストラクタ起動");
        this.name = _name;
        this.hitPoint = maximumHP;
        this.attack = _attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    } 

    /**
     * フィールドdeadを取得するためのgetterメソッド
     * @return 自分自身のdeadフィールド
     */
    public boolean isDead(){
        return this.dead;
    }

    /**
     * フィールドnameを取得するためのgetterメソッド
     * @return　自分自身のnameフィールド
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * フィールドhitPointを取得するためのgetterメソッド
     * @return　自分自身のhitPointフィールド
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * opponentへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponemt 攻撃対象
     */
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if(this.dead == false){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */   
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}


