/* Generated By:JavaCC: Do not edit this line. parsernameTokenManager.java */
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/** Token Manager. */
public class parsernameTokenManager implements parsernameConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x18000000L) != 0L || (active1 & 0x1L) != 0L)
            return 10;
         if ((active0 & 0x1004L) != 0L)
            return 0;
         if ((active0 & 0x8000000200000L) != 0L)
            return 4;
         if ((active0 & 0x2000000L) != 0L)
            return 7;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x4000000000000000L, 0x0L);
      case 41:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L, 0x0L);
      case 42:
         return jjStopAtPos(0, 11);
      case 43:
         return jjStopAtPos(0, 9);
      case 44:
         return jjStopAtPos(0, 24);
      case 45:
         return jjStopAtPos(0, 10);
      case 47:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x4L, 0x0L);
      case 59:
         return jjStopAtPos(0, 23);
      case 61:
         return jjStopAtPos(0, 22);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x800000000L, 0x0L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x2000000L, 0x0L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x800000000000000L, 0x0L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x90e020a080000000L, 0x0L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x18000000L, 0x1L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x28a0000000000L, 0x0L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x8000000200000L, 0x0L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x5140000000000L, 0x0L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x40000000L, 0x0L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x415000000000L, 0x0L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x400000000L, 0x0L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x2100000020000000L, 0x0L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x10000004000000L, 0x0L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x400000000000000L, 0x0L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      case 42:
         if ((active0 & 0x4L) != 0L)
            return jjStopAtPos(1, 2);
         break;
      case 59:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x48000000L, active1, 0L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x1c74000000000L, active1, 0L);
      case 70:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         break;
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x410000000000000L, active1, 0L);
      case 73:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000010000000L, active1, 0L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x9080000880200000L, active1, 0L);
      case 79:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         return jjMoveStringLiteralDfa2_0(active0, 0x1002000000L, active1, 0L);
      case 81:
         return jjMoveStringLiteralDfa2_0(active0, 0x20a000000000L, active1, 0L);
      case 82:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         return jjMoveStringLiteralDfa2_0(active0, 0x2100000024000000L, active1, 0L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x1L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 66:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(2, 37);
         break;
      case 68:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(2, 35);
         return jjMoveStringLiteralDfa3_0(active0, 0x9080000080000000L, active1, 0L);
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000000L, active1, 0L);
      case 70:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(2, 45);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(2, 47);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(2, 48);
         break;
      case 73:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(2, 39);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(2, 41);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(2, 42);
         return jjMoveStringLiteralDfa3_0(active0, 0x500000040000000L, active1, 0L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L, active1, 0L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x1L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000032000000L, active1, 0L);
      case 81:
         return jjMoveStringLiteralDfa3_0(active0, 0x414000000000L, active1, 0L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x60000000000000L, active1, 0L);
      case 84:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(2, 21);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(2, 36);
         break;
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L, active1, 0L);
      case 66:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(3, 38);
         break;
      case 67:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(3, 61);
         else if ((active1 & 0x1L) != 0L)
            return jjStopAtPos(3, 64);
         break;
      case 69:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(3, 26);
         else if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000000L, active1, 0L);
      case 70:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(3, 46);
         break;
      case 71:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L, active1, 0L);
      case 73:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(3, 40);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000000L, active1, 0L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000002000000L, active1, 0L);
      case 77:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L, active1, 0L);
      case 78:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(3, 30);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(3, 52);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000000L, active1, 0L);
      case 80:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000000000L, active1, 0L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L, active1, 0L);
      case 87:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 69:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(4, 27);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(4, 58);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 70:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(4, 55);
         break;
      case 72:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000000L);
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000000L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000020000000L);
      case 84:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(4, 28);
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(5, 56);
         break;
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x22000000L);
      case 70:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(5, 53);
         break;
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000080000000L);
      case 79:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 67:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(6, 63);
         break;
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000000000L);
      case 77:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(6, 29);
         break;
      case 78:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(6, 25);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(6, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(7, 60);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 19;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar != 47)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(1);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddStates(0, 2);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(13);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 15:
                  if (curChar == 46)
                     jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(16);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjstateSet[jjnewStateCnt++] = 18;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjCheckNAdd(18);
                  }
                  else if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 1:
                  if (kind > 1)
                     kind = 1;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
               case 5:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(5);
                  break;
               case 6:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
               case 8:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(8);
                  break;
               case 9:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
               case 11:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(11);
                  break;
               case 17:
               case 18:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 19 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x8L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x8L) != 0L)
            return jjStopAtPos(1, 3);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   13, 14, 15, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\53", "\55", "\52", 
"\57", null, null, null, null, null, null, null, null, "\111\116\124", "\75", "\73", 
"\54", "\102\117\117\114\105\101\116", "\124\122\125\105", "\106\101\114\123\105", 
"\106\114\117\101\124", "\120\122\117\107\122\101\115", "\115\101\111\116", 
"\105\116\104\115\101\111\116", "\50", "\51", "\117\122", "\101\116\104", "\116\117\124", "\105\121\102", 
"\116\105\121\102", "\105\121\111", "\116\105\121\111", "\107\105\111", "\114\105\111", 
"\107\111", "\114\111", "\105\121\106", "\116\105\121\106", "\107\105\106", 
"\114\105\106", "\107\106", "\114\106", "\111\106", "\124\110\105\116", 
"\105\114\123\105\111\106", "\105\114\123\105", "\105\116\104\111\106", "\120\122\111\116\124\50", 
"\51\73", "\127\110\111\114\105", "\104\117", "\105\116\104\127\110\111\114\105", 
"\120\122\117\103", "\50\51", "\105\116\104\120\122\117\103", "\106\125\116\103", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "COMMENT_STATE",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffffffff7e01L, 0x1L, 
};
static final long[] jjtoSkip = {
   0x1feL, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[19];
static private final int[] jjstateSet = new int[38];
static protected char curChar;
/** Constructor. */
public parsernameTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public parsernameTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 19; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 4)
       {
          jjmatchedKind = 4;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
