package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zza extends com.google.android.gms.measurement.zzc {
    private final com.google.android.gms.measurement.internal.zzio zza;
    private final com.google.android.gms.measurement.internal.zzlw zzb;

    public zza(com.google.android.gms.measurement.internal.zzio r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r1.zza = r2
            com.google.android.gms.measurement.internal.zzlw r2 = r2.zzq()
            r1.zzb = r2
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final int zza(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            r0.zzi(r2)
            r2 = 25
            return r2
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final long zzb() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            long r0 = r0.zzs()
            return r0
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Boolean zzc() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.Boolean r0 = r0.zzl()
            return r0
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Double zzd() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.Double r0 = r0.zzm()
            return r0
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Integer zze() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.Integer r0 = r0.zzp()
            return r0
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Long zzf() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.Long r0 = r0.zzq()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.Object zzg(int r2) {
            r1 = this;
            if (r2 == 0) goto L27
            r0 = 1
            if (r2 == r0) goto L20
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 3
            if (r2 == r0) goto L12
            com.google.android.gms.measurement.internal.zzlw r2 = r1.zzb
            java.lang.Boolean r2 = r2.zzl()
            return r2
        L12:
            com.google.android.gms.measurement.internal.zzlw r2 = r1.zzb
            java.lang.Integer r2 = r2.zzp()
            return r2
        L19:
            com.google.android.gms.measurement.internal.zzlw r2 = r1.zzb
            java.lang.Double r2 = r2.zzm()
            return r2
        L20:
            com.google.android.gms.measurement.internal.zzlw r2 = r1.zzb
            java.lang.Long r2 = r2.zzq()
            return r2
        L27:
            com.google.android.gms.measurement.internal.zzlw r2 = r1.zzb
            java.lang.String r2 = r2.zzu()
            return r2
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzh() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.String r0 = r0.zzr()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzi() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.String r0 = r0.zzs()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzj() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.String r0 = r0.zzt()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzk() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.String r0 = r0.zzr()
            return r0
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.String zzl() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.lang.String r0 = r0.zzu()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.util.List zzm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.util.ArrayList r2 = r0.zzv(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.util.Map zzn(boolean r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r3.zzb
            java.util.List r4 = r0.zzw(r4)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            com.google.android.gms.measurement.internal.zzqb r1 = (com.google.android.gms.measurement.internal.zzqb) r1
            java.lang.Object r2 = r1.zza()
            if (r2 == 0) goto L13
            java.lang.String r1 = r1.zzb
            r0.put(r1, r2)
            goto L13
        L2b:
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.util.Map zzo(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            java.util.Map r2 = r0.zzx(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzp(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzd r1 = r0.zzd()
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r2 = r0.elapsedRealtime()
            r1.zzd(r5, r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzq(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zzJ(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzr(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzd r1 = r0.zzd()
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r2 = r0.elapsedRealtime()
            r1.zze(r5, r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzs(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            r0.zzO(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzt(java.lang.String r9, java.lang.String r10, android.os.Bundle r11, long r12) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r8.zzb
            r4 = 1
            r5 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            r0.zzP(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzu(com.google.android.gms.measurement.internal.zzkc r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            r0.zzV(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzv(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            r0.zzad(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzw(com.google.android.gms.measurement.internal.zzkb r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            r0.zzah(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzx(com.google.android.gms.measurement.internal.zzkc r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zzb
            r0.zzao(r2)
            return
    }
}
