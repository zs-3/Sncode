package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Sort {
    private static com.badlogic.gdx.utils.Sort instance;
    private com.badlogic.gdx.utils.ComparableTimSort comparableTimSort;
    private com.badlogic.gdx.utils.TimSort timSort;

    public Sort() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.badlogic.gdx.utils.Sort instance() {
            com.badlogic.gdx.utils.Sort r0 = com.badlogic.gdx.utils.Sort.instance
            if (r0 != 0) goto Lb
            com.badlogic.gdx.utils.Sort r0 = new com.badlogic.gdx.utils.Sort
            r0.<init>()
            com.badlogic.gdx.utils.Sort.instance = r0
        Lb:
            com.badlogic.gdx.utils.Sort r0 = com.badlogic.gdx.utils.Sort.instance
            return r0
    }

    public void sort(java.lang.Object[] r2, int r3, int r4) {
            r1 = this;
            com.badlogic.gdx.utils.ComparableTimSort r0 = r1.comparableTimSort
            if (r0 != 0) goto Lb
            com.badlogic.gdx.utils.ComparableTimSort r0 = new com.badlogic.gdx.utils.ComparableTimSort
            r0.<init>()
            r1.comparableTimSort = r0
        Lb:
            com.badlogic.gdx.utils.ComparableTimSort r0 = r1.comparableTimSort
            r0.doSort(r2, r3, r4)
            return
    }

    public <T> void sort(T[] r2, java.util.Comparator<? super T> r3, int r4, int r5) {
            r1 = this;
            com.badlogic.gdx.utils.TimSort r0 = r1.timSort
            if (r0 != 0) goto Lb
            com.badlogic.gdx.utils.TimSort r0 = new com.badlogic.gdx.utils.TimSort
            r0.<init>()
            r1.timSort = r0
        Lb:
            com.badlogic.gdx.utils.TimSort r0 = r1.timSort
            r0.doSort(r2, r3, r4, r5)
            return
    }
}
