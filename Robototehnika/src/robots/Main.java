package robots;
/*Створити клас Robot від якого унаслідувати CofeRobot,RobotDancer,
 * RobotCuckier в Robot є метод work(),в якому слід описувати роботу 
 * яку виконує кожен з роботів
 *   -- Для Robot в методі work() слід написати код ,щоб на консоль 
 *      виводився наступний текст << Я Robot-я просто працюю >>
 *   -- Для CofeRobot в методі work() слід написати код ,щоб на консоль
 *      виводився наступний текст << Я CofeRobot - я варю каву>>
 *   -- Для RobotDancer в методі work() слід написати код ,щоб на консоль
 *      виводився наступний текст << Я RobotDancer - я просто танцюю >>
 *   -- Для RobotCuckier в методі work() слід написати код ,щоб на консоль
 *      виводився наступний текст << Я RobotCuckier - я просто готую >>
 * ++Створити в Main класі екземпляри вищеописаних класів і викликати до 
 * кожного з них метод work().
 * ++Створити в Main класі масив Robot ,заповнити масив екземплярами вище
 * описаних класів.Створити масив for ,пройтись по всіх елементах масиву
 * і викликати для кожного елементу метод work() */
public class Main {
	public static void main(String[] args) {
		Robot robik=new Robot();
		robik.work();
		CofeRobot cofe = new CofeRobot();
		cofe.work();
		RobotDancer dancer = new RobotDancer();
		dancer.work(); 
		RobotCuckier cuckier = new RobotCuckier();
		cuckier.work();
	    Robot[]robots={robik,cofe,dancer,cuckier};
	    for (int i = 0; i < robots.length; i++) {
	    	robots[i].work();
		}
	}
}
