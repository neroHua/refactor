package chapter02;

/**
 * refactor defining
 * 重构定义
 * a change made to internal structure of software to make it easier to understand and cheaper to modify without changing its observable behavior
 * 改变软件的内部结构使得程序更加容易理解，更加容易修改，但是不改变外部使用的功能
 *
 * why should you refactor?
 * 为什么需要重构
 *      refactoring improves the design of software
 *      重构改进代码的设计
 *      refactoring make software easier to understand
 *      更易读
 *      refactoring make software easier to modify
 *      更容易修改
 *      refactoring help you find bugs
 *      帮助发现bugs, 其实也有助于减少bug
 *      refactoring help you program faster
 *      加快编程速度
 *
 * when should you do refactor?
 * 什么时候进行重构
 *      refactor when you add function
 *      添加功能时
 *      refactor when you need to fix a bug
 *      修复bug时
 *      refactor when you do code review
 *      代码复审时, 确保你的refactor是正确的
 *
 * interesting words from kent beck
 *      programs that are hard to read are hard to modify
 *      programs that have duplicated logic are hard to modify
 *      programs that require additional behavior that requires you to change running code are hard to modify
 *      以我的角度来看这件事情，不是很直观，现在在读就比较容易理解了
 *      programs with complex conditional logic are hard to modify
 *
 *  What Do I Tell My Manager?
 *  显然书中说的话对技术经理来说，可能不用说，对于非技术经理来说，是不能那么说的
 *
 * When shouldn't you refactor?
 * 什么时候不能进行重构
 *      The principle example is when you should rewrite from scratch instead.
 *      代码非常难以改变，需要重新写
 *      The other time you should avoid refactoring is when you are close to a deadline.
 *      交付日期接近时，不能进行重构
 *
 * Refactoring and Performance
 * 重构与性能
 *      To make the software easier to understand, you often make changes that will cause the program to run more slowly.
 *      重构往往降低性能
 */
public class PrinciplesInRefactoring {
}
