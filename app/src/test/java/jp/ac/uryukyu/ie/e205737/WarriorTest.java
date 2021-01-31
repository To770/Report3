/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e205737;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する
     */
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorAttack = 100;
        int previousEnemyHitPoint;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 450, 100);
        for(int i = 0; i < 3; i++){
            previousEnemyHitPoint = slime.hitPoint;
            demoWarrior.attackWithWeponSkill(slime);
            //slime.attack(demoWarrior);
            assertEquals(previousEnemyHitPoint - slime.hitPoint, (int)(defaultWarriorAttack * 1.5));
        }
    }    
}
