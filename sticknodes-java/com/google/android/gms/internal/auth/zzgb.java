package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzgb implements com.google.android.gms.internal.auth.zzgi {
    private final com.google.android.gms.internal.auth.zzfx zza;
    private final com.google.android.gms.internal.auth.zzgz zzb;
    private final com.google.android.gms.internal.auth.zzem zzc;

    private zzgb(com.google.android.gms.internal.auth.zzgz r1, com.google.android.gms.internal.auth.zzem r2, com.google.android.gms.internal.auth.zzfx r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zza = r3
            return
    }

    static com.google.android.gms.internal.auth.zzgb zzb(com.google.android.gms.internal.auth.zzgz r1, com.google.android.gms.internal.auth.zzem r2, com.google.android.gms.internal.auth.zzfx r3) {
            com.google.android.gms.internal.auth.zzgb r0 = new com.google.android.gms.internal.auth.zzgb
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzgz r0 = r1.zzb
            java.lang.Object r2 = r0.zzb(r2)
            int r2 = r2.hashCode()
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final java.lang.Object zzd() {
            r3 = this;
            com.google.android.gms.internal.auth.zzfx r0 = r3.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzev
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            com.google.android.gms.internal.auth.zzev r0 = r0.zzc()
            return r0
        Ld:
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.zzn(r1, r2, r2)
            com.google.android.gms.internal.auth.zzet r0 = (com.google.android.gms.internal.auth.zzet) r0
            com.google.android.gms.internal.auth.zzfx r0 = r0.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzgz r0 = r1.zzb
            r0.zze(r2)
            com.google.android.gms.internal.auth.zzem r0 = r1.zzc
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.auth.zzgz r0 = r1.zzb
            com.google.android.gms.internal.auth.zzgk.zzd(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(java.lang.Object r1, byte[] r2, int r3, int r4, com.google.android.gms.internal.auth.zzdt r5) throws java.io.IOException {
            r0 = this;
            r2 = r1
            com.google.android.gms.internal.auth.zzev r2 = (com.google.android.gms.internal.auth.zzev) r2
            com.google.android.gms.internal.auth.zzha r3 = r2.zzc
            com.google.android.gms.internal.auth.zzha r4 = com.google.android.gms.internal.auth.zzha.zza()
            if (r3 == r4) goto Lc
            goto L12
        Lc:
            com.google.android.gms.internal.auth.zzha r3 = com.google.android.gms.internal.auth.zzha.zzd()
            r2.zzc = r3
        L12:
            com.google.android.gms.internal.auth.zzeu r1 = (com.google.android.gms.internal.auth.zzeu) r1
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.auth.zzgz r0 = r1.zzb
            java.lang.Object r2 = r0.zzb(r2)
            com.google.android.gms.internal.auth.zzgz r0 = r1.zzb
            java.lang.Object r3 = r0.zzb(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzem r0 = r1.zzc
            r0.zza(r2)
            r2 = 0
            throw r2
    }
}
