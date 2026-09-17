package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzy implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.common.zzaa zzb;

    zzy(com.google.android.gms.internal.common.zzaa r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.common.zzaa r0 = r2.zzb
            java.lang.CharSequence r1 = r2.zza
            java.util.Iterator r0 = com.google.android.gms.internal.common.zzaa.zze(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 91
            r1.append(r2)
            java.util.Iterator r2 = r4.iterator()
            boolean r3 = r2.hasNext()     // Catch: java.io.IOException -> L40
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()     // Catch: java.io.IOException -> L40
            java.lang.CharSequence r3 = com.google.android.gms.internal.common.zzt.zza(r3, r0)     // Catch: java.io.IOException -> L40
            r1.append(r3)     // Catch: java.io.IOException -> L40
        L21:
            boolean r3 = r2.hasNext()     // Catch: java.io.IOException -> L40
            if (r3 == 0) goto L36
            r1.append(r0)     // Catch: java.io.IOException -> L40
            java.lang.Object r3 = r2.next()     // Catch: java.io.IOException -> L40
            java.lang.CharSequence r3 = com.google.android.gms.internal.common.zzt.zza(r3, r0)     // Catch: java.io.IOException -> L40
            r1.append(r3)     // Catch: java.io.IOException -> L40
            goto L21
        L36:
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L40:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
