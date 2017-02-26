package robots;
/*�������� ���� Robot �� ����� ����������� CofeRobot,RobotDancer,
 * RobotCuckier � Robot � ����� work(),� ����� ��� ��������� ������ 
 * ��� ������ ����� � ������
 *   -- ��� Robot � ����� work() ��� �������� ��� ,��� �� ������� 
 *      ��������� ��������� ����� << � Robot-� ������ ������ >>
 *   -- ��� CofeRobot � ����� work() ��� �������� ��� ,��� �� �������
 *      ��������� ��������� ����� << � CofeRobot - � ���� ����>>
 *   -- ��� RobotDancer � ����� work() ��� �������� ��� ,��� �� �������
 *      ��������� ��������� ����� << � RobotDancer - � ������ ������ >>
 *   -- ��� RobotCuckier � ����� work() ��� �������� ��� ,��� �� �������
 *      ��������� ��������� ����� << � RobotCuckier - � ������ ����� >>
 * ++�������� � Main ���� ���������� ������������ ����� � ��������� �� 
 * ������� � ��� ����� work().
 * ++�������� � Main ���� ����� Robot ,��������� ����� ������������ ����
 * �������� �����.�������� ����� for ,�������� �� ��� ��������� ������
 * � ��������� ��� ������� �������� ����� work() */
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
