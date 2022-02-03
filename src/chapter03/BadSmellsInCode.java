package chapter03;

/**
 * bad smells in code
 * 代码的坏味道
 *
 * 1. Duplicated Code
 *
 * 2. Large Class
 *      注释：尽量还是以单一职责为准
 *
 * 3. Long Method
 *
 * 4. Long Parameter List
 *
 * 5. Divergent Change
 *      联系紧密的字段和方法可以提取成一个类
 *
 * 6. Shotgun Surgery
 *      一个字段或者方法跟当前类的关系不够紧密可以放到别的类(该类可以新建)
 *
 * 7. Feature Envy
 *      当一个类A从一个类B中获取几个字段，并根据这几个字段进行计算或者逻辑处理时，这部分处理最好放在B中
 *
 * 8. Data Clumps
 *      封装成树和有关系的类
 *
 * 9. Primitive Obsession
 *      尽量不要使用基本类型，除了只在自身类中使用的
 *
 * 9. Switch Statements
 *
 * 10. Parallel Inheritance Hierarchies
 *      这个应该是除了工厂方法模式了
 *
 * 11. Lazy Class
 *
 * 12.Speculative Generality
 *      不要开发未来才使用的功能，只需要现在的就可以了，以后说不定不用现在的功能了
 *
 * 13. Temporary Field
 *      这个是真的完美，暂时不会初始化的字段，可以使用子类
 *
 * 13. Message Chains
 *      除了责任链模式
 *
 * 14. Middle Man
 *
 * 15. Inappropriate Intimacy
 *
 * 16. Alternative Classes with Different Interfaces
 *
 * 17. Incomplete Library Class
 *
 * 18. Data Class
 *
 * 19. Refused Bequest
 *      这个也真的是非常完美的，需要改变继承体系
 *
 * 20. Comments
 *      尽量少些注释
 */
public class BadSmellsInCode {
}
