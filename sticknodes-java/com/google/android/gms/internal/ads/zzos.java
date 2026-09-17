package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzos {
    public static final com.google.android.gms.internal.ads.zzos zza = null;
    static final com.google.android.gms.internal.ads.zzgba zzb = null;

    @android.annotation.SuppressLint({"InlinedApi"})
    private static final com.google.android.gms.internal.ads.zzgax zzc = null;
    private final android.util.SparseArray zzd;
    private final int zze;

    static {
            com.google.android.gms.internal.ads.zzos r0 = new com.google.android.gms.internal.ads.zzos
            com.google.android.gms.internal.ads.zzoq r1 = com.google.android.gms.internal.ads.zzoq.zza
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzo(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzos.zza = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzq(r0, r1, r2)
            com.google.android.gms.internal.ads.zzos.zzc = r0
            com.google.android.gms.internal.ads.zzgaz r0 = new com.google.android.gms.internal.ads.zzgaz
            r0.<init>()
            r0.zza(r1, r2)
            r1 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zza(r1, r2)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zza(r1, r2)
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.zza(r1, r3)
            r1 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zza(r1, r2)
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zza(r2, r1)
            r0.zza(r1, r1)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.zza(r2, r1)
            com.google.android.gms.internal.ads.zzgba r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzos.zzb = r0
            return
    }

    private zzos(java.util.List r6) {
            r5 = this;
            r5.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.zzd = r0
            r0 = 0
            r1 = 0
        Lc:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            com.google.android.gms.internal.ads.zzoq r2 = (com.google.android.gms.internal.ads.zzoq) r2
            android.util.SparseArray r3 = r5.zzd
            int r4 = r2.zzb
            r3.put(r4, r2)
            int r1 = r1 + 1
            goto Lc
        L22:
            r6 = 0
        L23:
            android.util.SparseArray r1 = r5.zzd
            int r1 = r1.size()
            if (r0 >= r1) goto L3c
            android.util.SparseArray r1 = r5.zzd
            java.lang.Object r1 = r1.valueAt(r0)
            com.google.android.gms.internal.ads.zzoq r1 = (com.google.android.gms.internal.ads.zzoq) r1
            int r1 = r1.zzc
            int r6 = java.lang.Math.max(r6, r1)
            int r0 = r0 + 1
            goto L23
        L3c:
            r5.zze = r6
            return
    }

    /* synthetic */ zzos(java.util.List r1, com.google.android.gms.internal.ads.zzor r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static android.net.Uri zza() {
            boolean r0 = zzf()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "external_surround_sound_enabled"
            android.net.Uri r0 = android.provider.Settings.Global.getUriFor(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    static com.google.android.gms.internal.ads.zzos zzc(android.content.Context r2, com.google.android.gms.internal.ads.zzh r3, com.google.android.gms.internal.ads.zzpa r4) {
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.media.action.HDMI_AUDIO_PLUG"
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r0 = r2.registerReceiver(r1, r0)
            com.google.android.gms.internal.ads.zzos r2 = zzd(r2, r0, r3, r4)
            return r2
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    static com.google.android.gms.internal.ads.zzos zzd(android.content.Context r4, android.content.Intent r5, com.google.android.gms.internal.ads.zzh r6, com.google.android.gms.internal.ads.zzpa r7) {
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r4.getSystemService(r0)
            java.util.Objects.requireNonNull(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 33
            if (r7 != 0) goto L19
            int r7 = com.google.android.gms.internal.ads.zzeu.zza
            if (r7 < r1) goto L18
            com.google.android.gms.internal.ads.zzpa r7 = com.google.android.gms.internal.ads.zzop.zzb(r0, r6)
            goto L19
        L18:
            r7 = 0
        L19:
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            if (r2 < r1) goto L2f
            boolean r1 = com.google.android.gms.internal.ads.zzeu.zzL(r4)
            if (r1 != 0) goto L2a
            boolean r1 = com.google.android.gms.internal.ads.zzeu.zzH(r4)
            if (r1 != 0) goto L2a
            goto L2f
        L2a:
            com.google.android.gms.internal.ads.zzos r4 = com.google.android.gms.internal.ads.zzop.zza(r0, r6)
            return r4
        L2f:
            r1 = 23
            if (r2 < r1) goto L3d
            boolean r7 = com.google.android.gms.internal.ads.zzon.zza(r0, r7)
            if (r7 != 0) goto L3a
            goto L3d
        L3a:
            com.google.android.gms.internal.ads.zzos r4 = com.google.android.gms.internal.ads.zzos.zza
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzgbb r7 = new com.google.android.gms.internal.ads.zzgbb
            r7.<init>()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.zzf(r0)
            r0 = 29
            r1 = 10
            if (r2 < r0) goto L76
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzL(r4)
            if (r0 != 0) goto L5d
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzH(r4)
            if (r0 != 0) goto L5d
            goto L76
        L5d:
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzoo.zzb(r6)
            r7.zzh(r4)
            com.google.android.gms.internal.ads.zzos r4 = new com.google.android.gms.internal.ads.zzos
            com.google.android.gms.internal.ads.zzgbc r5 = r7.zzi()
            int[] r5 = com.google.android.gms.internal.ads.zzgdu.zzh(r5)
            com.google.android.gms.internal.ads.zzgax r5 = zze(r5, r1)
            r4.<init>(r5)
            return r4
        L76:
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r6 = "use_external_surround_sound_flag"
            r0 = 0
            int r6 = android.provider.Settings.Global.getInt(r4, r6, r0)
            r2 = 1
            if (r6 != r2) goto L86
            r6 = 1
            goto L87
        L86:
            r6 = 0
        L87:
            if (r6 != 0) goto L8f
            boolean r3 = zzf()
            if (r3 == 0) goto L9c
        L8f:
            java.lang.String r3 = "external_surround_sound_enabled"
            int r4 = android.provider.Settings.Global.getInt(r4, r3, r0)
            if (r4 != r2) goto L9c
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzos.zzc
            r7.zzh(r4)
        L9c:
            if (r5 == 0) goto Lcf
            if (r6 != 0) goto Lcf
            java.lang.String r4 = "android.media.extra.AUDIO_PLUG_STATE"
            int r4 = r5.getIntExtra(r4, r0)
            if (r4 != r2) goto Lcf
            java.lang.String r4 = "android.media.extra.ENCODINGS"
            int[] r4 = r5.getIntArrayExtra(r4)
            if (r4 == 0) goto Lb7
            java.util.List r4 = com.google.android.gms.internal.ads.zzgdu.zzg(r4)
            r7.zzh(r4)
        Lb7:
            com.google.android.gms.internal.ads.zzos r4 = new com.google.android.gms.internal.ads.zzos
            com.google.android.gms.internal.ads.zzgbc r6 = r7.zzi()
            int[] r6 = com.google.android.gms.internal.ads.zzgdu.zzh(r6)
            java.lang.String r7 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r5 = r5.getIntExtra(r7, r1)
            com.google.android.gms.internal.ads.zzgax r5 = zze(r6, r5)
            r4.<init>(r5)
            return r4
        Lcf:
            com.google.android.gms.internal.ads.zzos r4 = new com.google.android.gms.internal.ads.zzos
            com.google.android.gms.internal.ads.zzgbc r5 = r7.zzi()
            int[] r5 = com.google.android.gms.internal.ads.zzgdu.zzh(r5)
            com.google.android.gms.internal.ads.zzgax r5 = zze(r5, r1)
            r4.<init>(r5)
            return r4
    }

    private static com.google.android.gms.internal.ads.zzgax zze(int[] r4, int r5) {
            com.google.android.gms.internal.ads.zzgau r0 = new com.google.android.gms.internal.ads.zzgau
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L16
            r2 = r4[r1]
            com.google.android.gms.internal.ads.zzoq r3 = new com.google.android.gms.internal.ads.zzoq
            r3.<init>(r2, r5)
            r0.zzf(r3)
            int r1 = r1 + 1
            goto L6
        L16:
            com.google.android.gms.internal.ads.zzgax r4 = r0.zzi()
            return r4
    }

    private static boolean zzf() {
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzc
            java.lang.String r1 = "Amazon"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            java.lang.String r1 = "Xiaomi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzos
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzos r9 = (com.google.android.gms.internal.ads.zzos) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = 0
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            android.util.SparseArray r1 = r5.zzd
            r2 = 31
            if (r0 < r2) goto Ld
            int r0 = r1.contentHashCode()
            goto L2c
        Ld:
            r0 = 0
            r3 = 17
        L10:
            int r4 = r1.size()
            if (r0 >= r4) goto L2b
            int r3 = r3 * 31
            int r4 = r1.keyAt(r0)
            int r3 = r3 + r4
            int r3 = r3 * 31
            java.lang.Object r4 = r1.valueAt(r0)
            int r4 = java.util.Objects.hashCode(r4)
            int r3 = r3 + r4
            int r0 = r0 + 1
            goto L10
        L2b:
            r0 = r3
        L2c:
            int r1 = r5.zze
            int r0 = r0 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            android.util.SparseArray r0 = r3.zzd
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AudioCapabilities[maxChannelCount="
            r1.append(r2)
            int r2 = r3.zze
            r1.append(r2)
            java.lang.String r2 = ", audioProfiles="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r9, com.google.android.gms.internal.ads.zzh r10) {
            r8 = this;
            java.lang.String r0 = r9.zzn
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r9.zzj
            int r0 = com.google.android.gms.internal.ads.zzbn.zza(r0, r1)
            com.google.android.gms.internal.ads.zzgba r1 = com.google.android.gms.internal.ads.zzos.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc6
        L19:
            r1 = 7
            r2 = 6
            r3 = 8
            r4 = 18
            if (r0 != r4) goto L2d
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzF(r0, r4)
            if (r0 != 0) goto L2b
            r0 = 6
            goto L49
        L2b:
            r0 = 18
        L2d:
            if (r0 != r3) goto L3c
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzF(r0, r3)
            if (r0 == 0) goto L3a
            r0 = 8
            goto L3c
        L3a:
            r0 = 7
            goto L49
        L3c:
            r5 = 30
            if (r0 != r5) goto L49
            android.util.SparseArray r6 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzeu.zzF(r6, r5)
            if (r5 != 0) goto L49
            goto L3a
        L49:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzeu.zzF(r5, r0)
            if (r5 == 0) goto Lc6
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzoq r5 = (com.google.android.gms.internal.ads.zzoq) r5
            java.util.Objects.requireNonNull(r5)
            int r6 = r9.zzB
            r7 = -1
            if (r6 == r7) goto L80
            if (r0 != r4) goto L64
            goto L80
        L64:
            java.lang.String r9 = r9.zzn
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L79
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            r10 = 33
            if (r9 >= r10) goto L79
            r9 = 10
            if (r6 <= r9) goto L8b
            goto Lc6
        L79:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L8b
            goto Lc6
        L80:
            int r9 = r9.zzC
            if (r9 != r7) goto L87
            r9 = 48000(0xbb80, float:6.7262E-41)
        L87:
            int r6 = r5.zza(r9, r10)
        L8b:
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            r10 = 28
            if (r9 > r10) goto La0
            if (r6 != r1) goto L96
            r2 = 8
            goto La1
        L96:
            r10 = 3
            if (r6 == r10) goto La1
            r10 = 4
            if (r6 == r10) goto La1
            r10 = 5
            if (r6 != r10) goto La0
            goto La1
        La0:
            r2 = r6
        La1:
            r10 = 26
            if (r9 > r10) goto Lb3
            java.lang.String r9 = com.google.android.gms.internal.ads.zzeu.zzb
            java.lang.String r10 = "fugu"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto Lb3
            r9 = 1
            if (r2 != r9) goto Lb3
            r2 = 2
        Lb3:
            int r9 = com.google.android.gms.internal.ads.zzeu.zzh(r2)
            if (r9 == 0) goto Lc6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc6:
            r9 = 0
            return r9
    }
}
