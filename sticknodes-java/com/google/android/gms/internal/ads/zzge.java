package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzge extends com.google.android.gms.internal.ads.zzfz {
    private com.google.android.gms.internal.ads.zzgm zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzge() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.zzd
            if (r0 != 0) goto La
            r3 = -1
            return r3
        La:
            int r5 = java.lang.Math.min(r5, r0)
            byte[] r0 = r2.zzb
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            int r1 = r2.zzc
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.zzc
            int r3 = r3 + r5
            r2.zzc = r3
            int r3 = r2.zzd
            int r3 = r3 - r5
            r2.zzd = r3
            r2.zzg(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r8) throws java.io.IOException {
            r7 = this;
            r7.zzi(r8)
            r7.zza = r8
            android.net.Uri r0 = r8.zza
            android.net.Uri r0 = r0.normalizeScheme()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "data"
            boolean r2 = r2.equals(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Unsupported scheme: "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.zzdi.zze(r2, r1)
            java.lang.String r1 = r0.getSchemeSpecificPart()
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r2 = ","
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)
            int r2 = r1.length
            r3 = 0
            r4 = 2
            if (r2 != r4) goto La3
            r0 = 1
            r0 = r1[r0]
            r2 = 0
            r1 = r1[r2]
            java.lang.String r4 = ";base64"
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L59
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L49
            r7.zzb = r1     // Catch: java.lang.IllegalArgumentException -> L49
            goto L6b
        L49:
            r8 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Error while parsing Base64 encoded string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzbo r8 = com.google.android.gms.internal.ads.zzbo.zzb(r0, r8)
            throw r8
        L59:
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzfxo.zza
            java.lang.String r1 = r1.name()
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            r7.zzb = r0
        L6b:
            long r0 = r8.zze
            byte[] r2 = r7.zzb
            int r2 = r2.length
            long r4 = (long) r2
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L99
            int r1 = (int) r0
            r7.zzc = r1
            int r2 = r2 - r1
            r7.zzd = r2
            long r0 = r8.zzf
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L8b
            long r5 = (long) r2
            long r0 = java.lang.Math.min(r5, r0)
            int r1 = (int) r0
            r7.zzd = r1
        L8b:
            r7.zzj(r8)
            long r0 = r8.zzf
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L95
            return r0
        L95:
            int r8 = r7.zzd
            long r0 = (long) r8
            return r0
        L99:
            r7.zzb = r3
            com.google.android.gms.internal.ads.zzgh r8 = new com.google.android.gms.internal.ads.zzgh
            r0 = 2008(0x7d8, float:2.814E-42)
            r8.<init>(r0)
            throw r8
        La3:
            java.lang.String r8 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Unexpected URI format: "
            java.lang.String r8 = r0.concat(r8)
            com.google.android.gms.internal.ads.zzbo r8 = com.google.android.gms.internal.ads.zzbo.zzb(r8, r3)
            throw r8
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgm r0 = r1.zza
            if (r0 == 0) goto L7
            android.net.Uri r0 = r0.zza
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() {
            r2 = this;
            byte[] r0 = r2.zzb
            r1 = 0
            if (r0 == 0) goto La
            r2.zzb = r1
            r2.zzh()
        La:
            r2.zza = r1
            return
    }
}
