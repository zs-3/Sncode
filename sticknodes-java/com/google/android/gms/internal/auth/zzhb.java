package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzhb extends com.google.android.gms.internal.auth.zzgz {
    zzhb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.auth.zzev r3 = (com.google.android.gms.internal.auth.zzev) r3
            com.google.android.gms.internal.auth.zzha r0 = r3.zzc
            com.google.android.gms.internal.auth.zzha r1 = com.google.android.gms.internal.auth.zzha.zza()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zzd()
            r3.zzc = r0
        L10:
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ java.lang.Object zzb(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            com.google.android.gms.internal.auth.zzha r1 = r1.zzc
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* bridge */ /* synthetic */ java.lang.Object zzc(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zza()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L25
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zza()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.auth.zzha r3 = (com.google.android.gms.internal.auth.zzha) r3
            com.google.android.gms.internal.auth.zzha r2 = (com.google.android.gms.internal.auth.zzha) r2
            com.google.android.gms.internal.auth.zzha r2 = com.google.android.gms.internal.auth.zzha.zzc(r2, r3)
            goto L25
        L1d:
            com.google.android.gms.internal.auth.zzha r3 = (com.google.android.gms.internal.auth.zzha) r3
            r0 = r2
            com.google.android.gms.internal.auth.zzha r0 = (com.google.android.gms.internal.auth.zzha) r0
            r0.zzb(r3)
        L25:
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* bridge */ /* synthetic */ void zzd(java.lang.Object r1, int r2, long r3) {
            r0 = this;
            int r2 = r2 << 3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.google.android.gms.internal.auth.zzha r1 = (com.google.android.gms.internal.auth.zzha) r1
            r1.zzh(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final void zze(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            com.google.android.gms.internal.auth.zzha r1 = r1.zzc
            r1.zzf()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ void zzf(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            com.google.android.gms.internal.auth.zzha r2 = (com.google.android.gms.internal.auth.zzha) r2
            r1.zzc = r2
            return
    }
}
