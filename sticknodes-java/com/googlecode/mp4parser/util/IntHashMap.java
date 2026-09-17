package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class IntHashMap {
    private transient int count;
    private float loadFactor;
    private transient com.googlecode.mp4parser.util.IntHashMap.Entry[] table;
    private int threshold;

    private static class Entry {
        int hash;
        int key;
        com.googlecode.mp4parser.util.IntHashMap.Entry next;
        java.lang.Object value;

        protected Entry(int r1, int r2, java.lang.Object r3, com.googlecode.mp4parser.util.IntHashMap.Entry r4) {
                r0 = this;
                r0.<init>()
                r0.hash = r1
                r0.key = r2
                r0.value = r3
                r0.next = r4
                return
        }
    }

    public IntHashMap() {
            r2 = this;
            r0 = 20
            r1 = 1061158912(0x3f400000, float:0.75)
            r2.<init>(r0, r1)
            return
    }

    public IntHashMap(int r2) {
            r1 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r2, r0)
            return
    }

    public IntHashMap(int r3, float r4) {
            r2 = this;
            r2.<init>()
            if (r3 < 0) goto L2e
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1a
            if (r3 != 0) goto Ld
            r3 = 1
        Ld:
            r2.loadFactor = r4
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = new com.googlecode.mp4parser.util.IntHashMap.Entry[r3]
            r2.table = r0
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.threshold = r3
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal Load: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal Capacity: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public synchronized void clear() {
            r3 = this;
            monitor-enter(r3)
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r3.table     // Catch: java.lang.Throwable -> L11
            int r1 = r0.length     // Catch: java.lang.Throwable -> L11
        L4:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto Ld
            r0 = 0
            r3.count = r0     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        Ld:
            r2 = 0
            r0[r1] = r2     // Catch: java.lang.Throwable -> L11
            goto L4
        L11:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public boolean contains(java.lang.Object r5) {
            r4 = this;
            java.util.Objects.requireNonNull(r5)
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r4.table
            int r1 = r0.length
        L6:
            int r2 = r1 + (-1)
            if (r1 > 0) goto Lc
            r5 = 0
            return r5
        Lc:
            r1 = r0[r2]
        Le:
            if (r1 != 0) goto L12
            r1 = r2
            goto L6
        L12:
            java.lang.Object r3 = r1.value
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            com.googlecode.mp4parser.util.IntHashMap$Entry r1 = r1.next
            goto Le
    }

    public boolean containsKey(int r4) {
            r3 = this;
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r3.table
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            int r2 = r0.length
            int r1 = r1 % r2
            r0 = r0[r1]
        La:
            if (r0 != 0) goto Le
            r4 = 0
            return r4
        Le:
            int r1 = r0.hash
            if (r1 != r4) goto L14
            r4 = 1
            return r4
        L14:
            com.googlecode.mp4parser.util.IntHashMap$Entry r0 = r0.next
            goto La
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r0.contains(r1)
            return r1
    }

    public java.lang.Object get(int r4) {
            r3 = this;
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r3.table
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            int r2 = r0.length
            int r1 = r1 % r2
            r0 = r0[r1]
        La:
            if (r0 != 0) goto Le
            r4 = 0
            return r4
        Le:
            int r1 = r0.hash
            if (r1 != r4) goto L15
            java.lang.Object r4 = r0.value
            return r4
        L15:
            com.googlecode.mp4parser.util.IntHashMap$Entry r0 = r0.next
            goto La
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.count
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.Object put(int r6, java.lang.Object r7) {
            r5 = this;
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r5.table
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r6
            int r2 = r0.length
            int r2 = r1 % r2
            r3 = r0[r2]
        Lb:
            if (r3 != 0) goto L2c
            int r3 = r5.count
            int r4 = r5.threshold
            if (r3 < r4) goto L1b
            r5.rehash()
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r5.table
            int r2 = r0.length
            int r2 = r1 % r2
        L1b:
            com.googlecode.mp4parser.util.IntHashMap$Entry r1 = new com.googlecode.mp4parser.util.IntHashMap$Entry
            r3 = r0[r2]
            r1.<init>(r6, r6, r7, r3)
            r0[r2] = r1
            int r6 = r5.count
            int r6 = r6 + 1
            r5.count = r6
            r6 = 0
            return r6
        L2c:
            int r4 = r3.hash
            if (r4 != r6) goto L35
            java.lang.Object r6 = r3.value
            r3.value = r7
            return r6
        L35:
            com.googlecode.mp4parser.util.IntHashMap$Entry r3 = r3.next
            goto Lb
    }

    protected void rehash() {
            r8 = this;
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r8.table
            int r1 = r0.length
            int r2 = r1 * 2
            int r2 = r2 + 1
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r3 = new com.googlecode.mp4parser.util.IntHashMap.Entry[r2]
            float r4 = (float) r2
            float r5 = r8.loadFactor
            float r4 = r4 * r5
            int r4 = (int) r4
            r8.threshold = r4
            r8.table = r3
        L13:
            int r4 = r1 + (-1)
            if (r1 > 0) goto L18
            return
        L18:
            r1 = r0[r4]
        L1a:
            if (r1 != 0) goto L1e
            r1 = r4
            goto L13
        L1e:
            com.googlecode.mp4parser.util.IntHashMap$Entry r5 = r1.next
            int r6 = r1.hash
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            int r6 = r6 % r2
            r7 = r3[r6]
            r1.next = r7
            r3[r6] = r1
            r1 = r5
            goto L1a
    }

    public java.lang.Object remove(int r8) {
            r7 = this;
            com.googlecode.mp4parser.util.IntHashMap$Entry[] r0 = r7.table
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r8
            int r2 = r0.length
            int r1 = r1 % r2
            r2 = r0[r1]
            r3 = 0
            r4 = r3
        Lc:
            if (r2 != 0) goto Lf
            return r3
        Lf:
            int r5 = r2.hash
            if (r5 != r8) goto L29
            if (r4 == 0) goto L1a
            com.googlecode.mp4parser.util.IntHashMap$Entry r8 = r2.next
            r4.next = r8
            goto L1e
        L1a:
            com.googlecode.mp4parser.util.IntHashMap$Entry r8 = r2.next
            r0[r1] = r8
        L1e:
            int r8 = r7.count
            int r8 = r8 + (-1)
            r7.count = r8
            java.lang.Object r8 = r2.value
            r2.value = r3
            return r8
        L29:
            com.googlecode.mp4parser.util.IntHashMap$Entry r4 = r2.next
            r6 = r4
            r4 = r2
            r2 = r6
            goto Lc
    }

    public int size() {
            r1 = this;
            int r0 = r1.count
            return r0
    }
}
