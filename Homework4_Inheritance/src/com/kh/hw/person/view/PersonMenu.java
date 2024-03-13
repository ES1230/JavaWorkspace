package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public static final int MAX_STUDENT_COUNT = 3;
	
	public void mainMenu() {
		while(true) {
//			// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
//			// personCount()메소드의 반환 값을 이용하여 출력
			int[] arr = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+arr[0]+"명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 "+arr[1]+"명입니다.");			

			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: studentMenu(); break;
			case 2: employeeMenu(); break;
			case 9: System.out.println("종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void studentMenu() {
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			int studentCount = pc.personCount()[0];
			boolean isFulled = studentCount == MAX_STUDENT_COUNT;
			
			if(isFulled) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다. ");
			}
			// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
			// 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는
			// 위에 출력한 메뉴 모두 받을 수 있게 함
			System.out.print("메뉴 번호 :");		
			// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				if(isFulled) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. ");
				}else {
					insertStudent();				
				}
				break;
			case 2: 
				printStudent();
				break;
			case 9: 
				System.out.println("메인으로 돌아갑니다.");
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
			}
		}
		
	}
	public void employeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			
			int employeeCount = pc.personCount()[1];
			boolean isFulled = employeeCount == 10;
			
			if(isFulled) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다. ");
			}
			System.out.print("메뉴 번호 :");		
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				if(isFulled) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. ");
				}else {
					insertEmployee();				
				}
				break;
			case 2: 
				printEmployee();
				break;
			case 9: 
				System.out.println("메인으로 돌아갑니다.");
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
			}
		}

	}
	public void insertStudent() {
		while(true) {
			System.out.print("학생 이름 :");
			String name = sc.nextLine();
			
			System.out.print("학생 나이 :");
			int age = sc.nextInt();
			
			System.out.print("학생 키 :");
			double height = sc.nextDouble();
			
			System.out.print("학생 몸무게 :");
			double weigth = sc.nextDouble();
			
			System.out.print("학생 학년 :");
			int grade = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("학생 전공 :");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weigth, grade, major);// 학생객체배열에 데이터를 추가한후
			// 객체배열 내부에 초기화된 학생객체의 숫자를 얻어와야함
			int studentCount = pc.personCount()[0];
			if(studentCount != 3) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n' || ch == 'N') {
					break;
				}
			}else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}
		}
	}
	public void printStudent() {
		Student[] s = pc.printStudent();
		// pc의 printStudent() 메소드의 반환 값을 이용하여 학생 객체 배열에 저장된
		// 모든 데이터 출력
		for(int i =0; i<s.length;i++) {
			System.out.println(s[i]); // student객체 toString함수 자동으로 호출
		}
	}
	public void insertEmployee() {
		
	}
	public void printEmployee() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
