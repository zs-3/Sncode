package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
class zzmr extends java.util.AbstractSet {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;

    private zzmr(com.google.android.gms.internal.drive.zzmi r1) {
            r0 = this;
            r0.zzvk = r1
            r0.<init>()
            return
    }

    /* synthetic */ zzmr(com.google.android.gms.internal.drive.zzmi r1, com.google.android.gms.internal.drive.zzmj r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L19
            com.google.android.gms.internal.drive.zzmi r0 = r2.zzvk
            java.lang.Object r1 = r3.getKey()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r3 = r3.getValue()
            r0.zza(r1, r3)
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            com.google.android.gms.internal.drive.zzmi r0 = r1.zzvk
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            com.google.android.gms.internal.drive.zzmi r0 = r2.zzvk
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r3 = r3.getValue()
            if (r0 == r3) goto L1d
            if (r0 == 0) goto L1b
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1b
            goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
            r3 = this;
            com.google.android.gms.internal.drive.zzmq r0 = new com.google.android.gms.internal.drive.zzmq
            com.google.android.gms.internal.drive.zzmi r1 = r3.zzvk
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L13
            com.google.android.gms.internal.drive.zzmi r0 = r1.zzvk
            java.lang.Object r2 = r2.getKey()
            r0.remove(r2)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.android.gms.internal.drive.zzmi r0 = r1.zzvk
            int r0 = r0.size()
            return r0
    }
}
