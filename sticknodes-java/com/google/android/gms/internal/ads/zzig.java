package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzig implements com.google.android.gms.internal.ads.zzko {
    private final com.google.android.gms.internal.ads.zzza zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final java.util.HashMap zzg;
    private long zzh;

    public zzig() {
            r9 = this;
            com.google.android.gms.internal.ads.zzza r0 = new com.google.android.gms.internal.ads.zzza
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r0.<init>(r1, r2)
            r9.<init>()
            r1 = 2500(0x9c4, float:3.503E-42)
            r2 = 0
            java.lang.String r3 = "bufferForPlaybackMs"
            java.lang.String r4 = "0"
            zzk(r1, r2, r3, r4)
            r5 = 5000(0x1388, float:7.006E-42)
            java.lang.String r6 = "bufferForPlaybackAfterRebufferMs"
            zzk(r5, r2, r6, r4)
            r7 = 50000(0xc350, float:7.0065E-41)
            java.lang.String r8 = "minBufferMs"
            zzk(r7, r1, r8, r3)
            zzk(r7, r5, r8, r6)
            java.lang.String r1 = "maxBufferMs"
            zzk(r7, r7, r1, r8)
            java.lang.String r1 = "backBufferDurationMs"
            zzk(r2, r2, r1, r4)
            r9.zza = r0
            r0 = 50000(0xc350, double:2.47033E-319)
            long r2 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r9.zzb = r2
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r9.zzc = r0
            r0 = 2500(0x9c4, double:1.235E-320)
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r9.zzd = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r9.zze = r0
            r0 = 0
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r9.zzf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.zzg = r0
            r0 = -1
            r9.zzh = r0
            return
    }

    private static void zzk(int r1, int r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " cannot be less than "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            if (r1 < r2) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            com.google.android.gms.internal.ads.zzdi.zze(r1, r3)
            return
    }

    private final void zzl(com.google.android.gms.internal.ads.zzom r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzg
            java.lang.Object r2 = r0.remove(r2)
            if (r2 == 0) goto Lb
            r1.zzm()
        Lb:
            return
    }

    private final void zzm() {
            r2 = this;
            java.util.HashMap r0 = r2.zzg
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzza r0 = r2.zza
            r0.zze()
            return
        Le:
            com.google.android.gms.internal.ads.zzza r0 = r2.zza
            int r1 = r2.zza()
            r0.zzf(r1)
            return
    }

    final int zza() {
            r3 = this;
            java.util.HashMap r0 = r3.zzg
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.ads.zzif r2 = (com.google.android.gms.internal.ads.zzif) r2
            int r2 = r2.zzb
            int r1 = r1 + r2
            goto Lb
        L1b:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zzb(com.google.android.gms.internal.ads.zzom r3) {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc(com.google.android.gms.internal.ads.zzom r10) {
            r9 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            long r2 = r9.zzh
            r4 = 0
            r5 = 1
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L18
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L17
            goto L18
        L17:
            r5 = 0
        L18:
            java.lang.String r2 = "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."
            com.google.android.gms.internal.ads.zzdi.zzg(r5, r2)
            r9.zzh = r0
            java.util.HashMap r0 = r9.zzg
            boolean r0 = r0.containsKey(r10)
            if (r0 != 0) goto L32
            java.util.HashMap r0 = r9.zzg
            com.google.android.gms.internal.ads.zzif r1 = new com.google.android.gms.internal.ads.zzif
            r2 = 0
            r1.<init>(r2)
            r0.put(r10, r1)
        L32:
            java.util.HashMap r0 = r9.zzg
            java.lang.Object r10 = r0.get(r10)
            com.google.android.gms.internal.ads.zzif r10 = (com.google.android.gms.internal.ads.zzif) r10
            java.util.Objects.requireNonNull(r10)
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            r10.zzb = r0
            r10.zza = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd(com.google.android.gms.internal.ads.zzom r3) {
            r2 = this;
            r2.zzl(r3)
            java.util.HashMap r3 = r2.zzg
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Lf
            r0 = -1
            r2.zzh = r0
        Lf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zze(com.google.android.gms.internal.ads.zzom r1) {
            r0 = this;
            r0.zzl(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzf(com.google.android.gms.internal.ads.zzom r3, com.google.android.gms.internal.ads.zzcc r4, com.google.android.gms.internal.ads.zzuy r5, com.google.android.gms.internal.ads.zzlr[] r6, com.google.android.gms.internal.ads.zzwy r7, com.google.android.gms.internal.ads.zzyl[] r8) {
            r2 = this;
            java.util.HashMap r4 = r2.zzg
            java.lang.Object r3 = r4.get(r3)
            com.google.android.gms.internal.ads.zzif r3 = (com.google.android.gms.internal.ads.zzif) r3
            java.util.Objects.requireNonNull(r3)
            r4 = 0
            r5 = 0
        Ld:
            int r7 = r6.length
            r7 = 2
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            if (r4 >= r7) goto L26
            r7 = r8[r4]
            if (r7 == 0) goto L23
            r7 = r6[r4]
            int r7 = r7.zzb()
            r1 = 1
            if (r7 == r1) goto L22
            r0 = 131072000(0x7d00000, float:3.1296362E-34)
        L22:
            int r5 = r5 + r0
        L23:
            int r4 = r4 + 1
            goto Ld
        L26:
            int r4 = java.lang.Math.max(r0, r5)
            r3.zzb = r4
            r2.zzm()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(com.google.android.gms.internal.ads.zzom r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzh(com.google.android.gms.internal.ads.zzkn r11) {
            r10 = this;
            java.util.HashMap r0 = r10.zzg
            com.google.android.gms.internal.ads.zzom r1 = r11.zza
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzif r0 = (com.google.android.gms.internal.ads.zzif) r0
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzza r1 = r10.zza
            int r1 = r1.zza()
            int r2 = r10.zza()
            long r3 = r10.zzb
            float r5 = r11.zzc
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L2b
            long r3 = com.google.android.gms.internal.ads.zzeu.zzp(r3, r5)
            long r5 = r10.zzc
            long r3 = java.lang.Math.min(r3, r5)
        L2b:
            long r5 = r11.zzb
            r7 = 500000(0x7a120, double:2.47033E-318)
            long r3 = java.lang.Math.max(r3, r7)
            r11 = 0
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L4c
            if (r1 >= r2) goto L3c
            r11 = 1
        L3c:
            r0.zza = r11
            if (r11 != 0) goto L56
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L56
            java.lang.String r11 = "DefaultLoadControl"
            java.lang.String r1 = "Target buffer size reached with less than 500ms of buffered media data."
            com.google.android.gms.internal.ads.zzea.zzf(r11, r1)
            goto L56
        L4c:
            long r3 = r10.zzc
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L54
            if (r1 < r2) goto L56
        L54:
            r0.zza = r11
        L56:
            boolean r11 = r0.zza
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzi(com.google.android.gms.internal.ads.zzkn r10) {
            r9 = this;
            boolean r0 = r10.zzd
            long r1 = r10.zzb
            float r3 = r10.zzc
            long r1 = com.google.android.gms.internal.ads.zzeu.zzq(r1, r3)
            if (r0 == 0) goto Lf
            long r3 = r9.zze
            goto L11
        Lf:
            long r3 = r9.zzd
        L11:
            long r5 = r10.zze
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L23
            r7 = 2
            long r5 = r5 / r7
            long r3 = java.lang.Math.min(r5, r3)
        L23:
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto L3c
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 >= 0) goto L3c
            com.google.android.gms.internal.ads.zzza r10 = r9.zza
            int r10 = r10.zza()
            int r0 = r9.zza()
            if (r10 < r0) goto L3a
            goto L3c
        L3a:
            r10 = 0
            return r10
        L3c:
            r10 = 1
            return r10
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final com.google.android.gms.internal.ads.zzza zzj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzza r0 = r1.zza
            return r0
    }
}
