package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqx implements com.google.android.gms.internal.ads.zzqb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzrc zza;

    /* synthetic */ zzqx(com.google.android.gms.internal.ads.zzrc r1, com.google.android.gms.internal.ads.zzqw r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zza(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring impossibly large audio latency: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "DefaultAudioSink"
            com.google.android.gms.internal.ads.zzea.zzf(r4, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzb(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzrc r0 = r2.zza
            com.google.android.gms.internal.ads.zzpv r1 = com.google.android.gms.internal.ads.zzrc.zzF(r0)
            if (r1 == 0) goto L17
            com.google.android.gms.internal.ads.zzpv r0 = com.google.android.gms.internal.ads.zzrc.zzF(r0)
            com.google.android.gms.internal.ads.zzrh r0 = (com.google.android.gms.internal.ads.zzrh) r0
            com.google.android.gms.internal.ads.zzri r0 = r0.zza
            com.google.android.gms.internal.ads.zzpq r0 = com.google.android.gms.internal.ads.zzri.zzae(r0)
            r0.zzv(r3)
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzc(long r7, long r9, long r11, long r13) {
            r6 = this;
            com.google.android.gms.internal.ads.zzrc r0 = r6.zza
            long r1 = com.google.android.gms.internal.ads.zzrc.zzC(r0)
            long r3 = com.google.android.gms.internal.ads.zzrc.zzD(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Spurious audio timestamp (frame position mismatch): "
            r0.append(r5)
            r0.append(r7)
            java.lang.String r7 = ", "
            r0.append(r7)
            r0.append(r9)
            r0.append(r7)
            r0.append(r11)
            r0.append(r7)
            r0.append(r13)
            r0.append(r7)
            r0.append(r1)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "DefaultAudioSink"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzd(long r7, long r9, long r11, long r13) {
            r6 = this;
            com.google.android.gms.internal.ads.zzrc r0 = r6.zza
            long r1 = com.google.android.gms.internal.ads.zzrc.zzC(r0)
            long r3 = com.google.android.gms.internal.ads.zzrc.zzD(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Spurious audio timestamp (system clock mismatch): "
            r0.append(r5)
            r0.append(r7)
            java.lang.String r7 = ", "
            r0.append(r7)
            r0.append(r9)
            r0.append(r7)
            r0.append(r11)
            r0.append(r7)
            r0.append(r13)
            r0.append(r7)
            r0.append(r1)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "DefaultAudioSink"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zze(int r12, long r13) {
            r11 = this;
            com.google.android.gms.internal.ads.zzrc r0 = r11.zza
            com.google.android.gms.internal.ads.zzpv r1 = com.google.android.gms.internal.ads.zzrc.zzF(r0)
            if (r1 == 0) goto L25
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = com.google.android.gms.internal.ads.zzrc.zzB(r0)
            long r9 = r1 - r3
            com.google.android.gms.internal.ads.zzrc r0 = r11.zza
            com.google.android.gms.internal.ads.zzpv r0 = com.google.android.gms.internal.ads.zzrc.zzF(r0)
            com.google.android.gms.internal.ads.zzrh r0 = (com.google.android.gms.internal.ads.zzrh) r0
            com.google.android.gms.internal.ads.zzri r0 = r0.zza
            com.google.android.gms.internal.ads.zzpq r5 = com.google.android.gms.internal.ads.zzri.zzae(r0)
            r6 = r12
            r7 = r13
            r5.zzx(r6, r7, r9)
        L25:
            return
    }
}
