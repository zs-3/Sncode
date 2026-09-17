package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class Int2 implements com.badlogic.gdx.utils.Pool.Poolable {
    private static java.util.Comparator<org.fortheloss.framework.Int2> mComparatorY;
    public int x;
    public int y;


    public Int2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.x = r0
            r1.y = r0
            return
    }

    public static java.util.Comparator<org.fortheloss.framework.Int2> getComparatorY() {
            java.util.Comparator<org.fortheloss.framework.Int2> r0 = org.fortheloss.framework.Int2.mComparatorY
            if (r0 != 0) goto Lb
            org.fortheloss.framework.Int2$2 r0 = new org.fortheloss.framework.Int2$2
            r0.<init>()
            org.fortheloss.framework.Int2.mComparatorY = r0
        Lb:
            java.util.Comparator<org.fortheloss.framework.Int2> r0 = org.fortheloss.framework.Int2.mComparatorY
            return r0
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1.x = r0
            r1.y = r0
            return
    }

    public void set(int r1, int r2) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.x
            int r1 = r4.y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
