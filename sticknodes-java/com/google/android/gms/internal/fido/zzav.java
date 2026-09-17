package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzav extends com.google.android.gms.internal.fido.zzaz {
    boolean zza;
    final /* synthetic */ java.lang.Object zzb;

    zzav(java.lang.Object r1) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 != 0) goto La
            r0 = 1
            r1.zza = r0
            java.lang.Object r0 = r1.zzb
            return r0
        La:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
