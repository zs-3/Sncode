package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzmq implements java.util.Iterator {
    private int pos;
    private java.util.Iterator zzvj;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;
    private boolean zzvo;

    private zzmq(com.google.android.gms.internal.drive.zzmi r1) {
            r0 = this;
            r0.zzvk = r1
            r0.<init>()
            r1 = -1
            r0.pos = r1
            return
    }

    /* synthetic */ zzmq(com.google.android.gms.internal.drive.zzmi r1, com.google.android.gms.internal.drive.zzmj r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final java.util.Iterator zzew() {
            r1 = this;
            java.util.Iterator r0 = r1.zzvj
            if (r0 != 0) goto L14
            com.google.android.gms.internal.drive.zzmi r0 = r1.zzvk
            java.util.Map r0 = com.google.android.gms.internal.drive.zzmi.zzc(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.zzvj = r0
        L14:
            java.util.Iterator r0 = r1.zzvj
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.pos
            r1 = 1
            int r0 = r0 + r1
            com.google.android.gms.internal.drive.zzmi r2 = r3.zzvk
            java.util.List r2 = com.google.android.gms.internal.drive.zzmi.zzb(r2)
            int r2 = r2.size()
            if (r0 < r2) goto L29
            com.google.android.gms.internal.drive.zzmi r0 = r3.zzvk
            java.util.Map r0 = com.google.android.gms.internal.drive.zzmi.zzc(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            java.util.Iterator r0 = r3.zzew()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = 0
            return r0
        L29:
            return r1
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
            r2 = this;
            r0 = 1
            r2.zzvo = r0
            int r1 = r2.pos
            int r1 = r1 + r0
            r2.pos = r1
            com.google.android.gms.internal.drive.zzmi r0 = r2.zzvk
            java.util.List r0 = com.google.android.gms.internal.drive.zzmi.zzb(r0)
            int r0 = r0.size()
            if (r1 >= r0) goto L23
            com.google.android.gms.internal.drive.zzmi r0 = r2.zzvk
            java.util.List r0 = com.google.android.gms.internal.drive.zzmi.zzb(r0)
            int r1 = r2.pos
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L23:
            java.util.Iterator r0 = r2.zzew()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.zzvo
            if (r0 == 0) goto L2e
            r0 = 0
            r3.zzvo = r0
            com.google.android.gms.internal.drive.zzmi r0 = r3.zzvk
            com.google.android.gms.internal.drive.zzmi.zza(r0)
            int r0 = r3.pos
            com.google.android.gms.internal.drive.zzmi r1 = r3.zzvk
            java.util.List r1 = com.google.android.gms.internal.drive.zzmi.zzb(r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            com.google.android.gms.internal.drive.zzmi r0 = r3.zzvk
            int r1 = r3.pos
            int r2 = r1 + (-1)
            r3.pos = r2
            com.google.android.gms.internal.drive.zzmi.zza(r0, r1)
            return
        L26:
            java.util.Iterator r0 = r3.zzew()
            r0.remove()
            return
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() was called before next()"
            r0.<init>(r1)
            throw r0
    }
}
