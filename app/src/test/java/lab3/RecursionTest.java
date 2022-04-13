package lab3;

import static org.junit.Assert.*;
import org.junit.FixMethodOrder;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RecursionTest {

    ////////////////////////////////////////////
    // JUnit test cases for recursion methods //
    ////////////////////////////////////////////

    @Test
    public void test00Len() {
        assertEquals(3, Recursion.len("abc"));
    }
    @Test
    public void test01Len() {
        assertEquals(7, Recursion.len("       "));
    }
    @Test
    public void test02Len() {
        assertEquals(0, Recursion.len(""));
    }
    @Test
    public void test03Len() {
        assertEquals(5, Recursion.len("\\\\\\\\\\"));
    }
    @Test
    public void test04Len() {
        assertEquals(15, Recursion.len("This is a test!"));
    }
    
    @Test
    public void test05CountE() {
        assertEquals(0, Recursion.countE(""));
    }
    @Test
    public void test06CountE() {
        assertEquals(0, Recursion.countE("abc"));
    }
    @Test
    public void test07CountE() {
        assertEquals(1, Recursion.countE("abcde"));
    }
    @Test
    public void test08CountE() {
        assertEquals(3, Recursion.countE("eaebcde"));
    }
    @Test
    public void test09CountE() {
        assertEquals(8, Recursion.countE("eaebcdeeeee e"));
    }
    
    @Test
    public void test10SumDigs() {
        assertEquals(1, Recursion.sumDigs(100000));
    }
    @Test
    public void test11SumDigs() {
        assertEquals(Recursion.sumDigs(100001), 2);
    }
    @Test
    public void test12SumDigs() {
        assertEquals(Recursion.sumDigs(99117812), 38);
    }
    @Test
    public void test13SumDigs() {
        assertEquals(0, Recursion.sumDigs(0));
    }
    @Test
    public void test14SumDigs() {
        assertEquals(25, Recursion.sumDigs(55555));
    }

    @Test
    public void test15Reverse() {
        assertEquals("", Recursion.reverse(""));
    }
    @Test
    public void test16Reverse() {
        assertEquals("racecar", Recursion.reverse("racecar"));
    }
    @Test
    public void test17Reverse() {
        assertEquals("maddam", Recursion.reverse("maddam"));
    }
    @Test
    public void test18Reverse() {
        assertEquals("01010101", Recursion.reverse("10101010"));
    }
    @Test
    public void test19Reverse() {
        assertEquals("<><", Recursion.reverse("<><"));
    }

    @Test
    public void test20BST(){
        BST t = new BST(0);
        assertEquals(false, t.isLeaf(t.root));
        assertEquals(0, t.size());
    }
    @Test
    public void test21BST(){
        BST t = new BST(0);
        assertEquals(0, t.size());
    }
    @Test
    public void test22BST(){
        BST t = new BST(0);
        t.preOrder();
        assertEquals("", t.traversal);
        t.inOrder();
        assertEquals("", t.traversal);
        t.postOrder();
        assertEquals("", t.traversal);
    }
    @Test
    public void test23BST(){
        BST t = new BST(0);
        assertEquals(-1, t.height());
    }
    
    @Test
    public void test24BST(){
        BST t = new BST(1);
        assertEquals(true, t.isLeaf(t.root));
        assertEquals(false, t.isLeaf(t.root.left));
    }
    @Test
    public void test25BST(){
        BST t = new BST(1);
        assertEquals(1, t.size());
    }
    @Test
    public void test26BST(){
        BST t = new BST(1);
        t.preOrder();
        assertEquals("4", t.traversal);
        t.inOrder();
        assertEquals("4", t.traversal);
        t.postOrder();
        assertEquals("4", t.traversal);
    }
    @Test
    public void test27BST(){
        BST t = new BST(1);
        assertEquals(0, t.height());
    }
    
    @Test
    public void test28BST(){
        BST t = new BST(2);
        assertEquals(false, t.isLeaf(t.root));
        assertEquals(true, t.isLeaf(t.root.left));
        assertEquals(true, t.isLeaf(t.root.right));
    }
    @Test
    public void test29BST(){
        BST t = new BST(2);
        assertEquals(3, t.size());
    }
    @Test
    public void test30BST(){
        BST t = new BST(2);
        t.preOrder();
        assertEquals("426", t.traversal);
        t.inOrder();
        assertEquals("246", t.traversal);
        t.postOrder();
        assertEquals("264", t.traversal);
    }
    @Test
    public void test31BST(){
        BST t = new BST(2);
        assertEquals(1, t.height());
    }
    
    @Test
    public void test32BST(){
        BST t = new BST(3);
        assertEquals(false, t.isLeaf(t.root));
        assertEquals(true, t.isLeaf(t.root.left));
        assertEquals(false, t.isLeaf(t.root.right));
        assertEquals(true, t.isLeaf(t.root.right.right.right.right));
    }
    @Test
    public void test33BST(){
        BST t = new BST(3);
        assertEquals(6, t.size());
    }
    @Test
    public void test34BST(){
        BST t = new BST(3);
        t.preOrder();
        assertEquals("426789", t.traversal);
        t.inOrder();
        assertEquals("246789", t.traversal);
        t.postOrder();
        assertEquals("298764", t.traversal);
    }
    @Test
    public void test35BST(){
        BST t = new BST(3);
        assertEquals(4, t.height());
    }
    @Test /* Contributed by Charlie Flood, Fall 2020 */
    public void test36BST(){
        BST t = new BST(4);
        t.preOrder();
        assertEquals("42106789", t.traversal);
        t.inOrder();
        assertEquals("01246789", t.traversal);
        t.postOrder();
        assertEquals("01298764", t.traversal);
    }
}
