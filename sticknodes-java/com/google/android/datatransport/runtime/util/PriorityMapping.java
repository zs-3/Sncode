package com.google.android.datatransport.runtime.util;

/* loaded from: classes.dex */
public final class PriorityMapping {
    private static java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> PRIORITY_INT_MAP;
    private static android.util.SparseArray<com.google.android.datatransport.Priority> PRIORITY_MAP;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_MAP = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_INT_MAP = r0
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.DEFAULT
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> r0 = com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_INT_MAP
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.VERY_LOW
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> r0 = com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_INT_MAP
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.HIGHEST
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> r0 = com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_INT_MAP
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            com.google.android.datatransport.Priority r1 = (com.google.android.datatransport.Priority) r1
            android.util.SparseArray<com.google.android.datatransport.Priority> r2 = com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_MAP
            java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> r3 = com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_INT_MAP
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.append(r3, r1)
            goto L3a
        L58:
            return
    }

    public PriorityMapping() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int toInt(com.google.android.datatransport.Priority r3) {
            java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> r0 = com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_INT_MAP
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r3 = r0.intValue()
            return r3
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PriorityMapping is missing known Priority value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static com.google.android.datatransport.Priority valueOf(int r3) {
            android.util.SparseArray<com.google.android.datatransport.Priority> r0 = com.google.android.datatransport.runtime.util.PriorityMapping.PRIORITY_MAP
            java.lang.Object r0 = r0.get(r3)
            com.google.android.datatransport.Priority r0 = (com.google.android.datatransport.Priority) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown Priority for value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
