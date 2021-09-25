package org.add;

public final class Greens {
	public final void greensOmr() {
System.out.println("Greens Tech Solutions");
}
	public void greensOmr(int roll) {
		System.out.println("Greens Tech Solutions "+ roll);
		}
	public void greensOmr(float num) {
		System.out.println("Greens Tech Solutions "+ num);
		}
	public void greensOmr(int n,int r) {
		System.out.println("Greens Tech Solutions "+n+" "+r);
		}
	public void greensOmr(String n, long r) {
		System.out.println(n+" Greens Tech Solutions "+r);
		}
	public void greensOmr(long t) {
		System.out.println(" Greens Tech Solutions ");
		}
	public void greensOmr(String p) {
		System.out.println(" Greens Tech Solutions ");
		}
public static void main(String[] args) {
	Greens g = new Greens();
	g.greensOmr();
	g.greensOmr(8326863);
	g.greensOmr(7264.43f);
	g.greensOmr(23132,214);
	g.greensOmr("idh", 142987972080l);
	g.greensOmr("Prahsj");
	g.greensOmr(278796535678457l);
}
	
}
