package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@org.jspecify.annotations.NullMarked
/* loaded from: classes.dex */
abstract class zzm implements java.util.Iterator {
    private java.lang.Object zza;
    private int zzb;

    protected zzm() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zzb = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.zzb
            r1 = 4
            if (r0 == r1) goto L24
            int r2 = r0 + (-1)
            if (r0 == 0) goto L22
            r0 = 1
            if (r2 == 0) goto L21
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L20
            r5.zzb = r1
            java.lang.Object r1 = r5.zza()
            r5.zza = r1
            int r1 = r5.zzb
            r2 = 3
            if (r1 == r2) goto L20
            r5.zzb = r0
            return r0
        L20:
            return r4
        L21:
            return r0
        L22:
            r0 = 0
            throw r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.zzb = r0
            java.lang.Object r0 = r2.zza
            r1 = 0
            r2.zza = r1
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    protected abstract java.lang.Object zza();

    protected final java.lang.Object zzb() {
            r1 = this;
            r0 = 3
            r1.zzb = r0
            r0 = 0
            return r0
    }
}
