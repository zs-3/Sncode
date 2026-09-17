package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdw extends com.google.android.gms.internal.auth.zzdy {
    final /* synthetic */ com.google.android.gms.internal.auth.zzef zza;
    private int zzb;
    private final int zzc;

    zzdw(com.google.android.gms.internal.auth.zzef r2) {
            r1 = this;
            r1.zza = r2
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            int r2 = r2.zzd()
            r1.zzc = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzea
    public final byte zza() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.zzb = r1
            com.google.android.gms.internal.auth.zzef r1 = r2.zza
            byte r0 = r1.zzb(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
