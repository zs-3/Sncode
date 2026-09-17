package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaeo implements com.google.android.gms.internal.ads.zzadb {
    private static final int[] zza = null;
    private static final int[] zzb = null;
    private static final byte[] zzc = null;
    private static final byte[] zzd = null;
    private final byte[] zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private com.google.android.gms.internal.ads.zzade zzn;
    private com.google.android.gms.internal.ads.zzaeh zzo;
    private com.google.android.gms.internal.ads.zzaea zzp;
    private boolean zzq;

    static {
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x0028: FILL_ARRAY_DATA , data: [13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1} // fill-array
            com.google.android.gms.internal.ads.zzaeo.zza = r1
            int[] r0 = new int[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1} // fill-array
            com.google.android.gms.internal.ads.zzaeo.zzb = r0
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = "#!AMR\n"
            byte[] r0 = r1.getBytes(r0)
            com.google.android.gms.internal.ads.zzaeo.zzc = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = "#!AMR-WB\n"
            byte[] r0 = r1.getBytes(r0)
            com.google.android.gms.internal.ads.zzaeo.zzd = r0
            return
    }

    public zzaeo() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzaeo(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 1
            byte[] r1 = new byte[r1]
            r0.zze = r1
            r1 = -1
            r0.zzk = r1
            return
    }

    private final int zza(com.google.android.gms.internal.ads.zzadc r10) throws java.io.IOException {
            r9 = this;
            int r0 = r9.zzi
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L8e
            r10.zzj()     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r9.zze     // Catch: java.io.EOFException -> L8d
            r10.zzh(r0, r1, r3)     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r9.zze     // Catch: java.io.EOFException -> L8d
            r0 = r0[r1]     // Catch: java.io.EOFException -> L8d
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L77
            int r0 = r0 >> 3
            boolean r4 = r9.zzf     // Catch: java.io.EOFException -> L8d
            r0 = r0 & 15
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L52
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L52
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = com.google.android.gms.internal.ads.zzaeo.zzb     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
            goto L3f
        L3b:
            int[] r4 = com.google.android.gms.internal.ads.zzaeo.zza     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
        L3f:
            r9.zzh = r0     // Catch: java.io.EOFException -> L8d
            r9.zzi = r0
            int r4 = r9.zzk
            if (r4 != r2) goto L4a
            r9.zzk = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L8e
            int r4 = r9.zzl
            int r4 = r4 + r3
            r9.zzl = r4
            goto L8e
        L52:
            java.lang.String r10 = "WB"
            java.lang.String r1 = "NB"
            if (r3 == r4) goto L59
            r10 = r1
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r1.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r3 = "Illegal AMR "
            r1.append(r3)     // Catch: java.io.EOFException -> L8d
            r1.append(r10)     // Catch: java.io.EOFException -> L8d
            java.lang.String r10 = " frame type "
            r1.append(r10)     // Catch: java.io.EOFException -> L8d
            r1.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r10 = r1.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zza(r10, r5)     // Catch: java.io.EOFException -> L8d
            throw r10     // Catch: java.io.EOFException -> L8d
        L77:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r10.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r1 = "Invalid padding bits for frame header "
            r10.append(r1)     // Catch: java.io.EOFException -> L8d
            r10.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r10 = r10.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zza(r10, r5)     // Catch: java.io.EOFException -> L8d
            throw r10     // Catch: java.io.EOFException -> L8d
        L8d:
            return r2
        L8e:
            com.google.android.gms.internal.ads.zzaeh r4 = r9.zzo
            int r10 = r4.zzf(r10, r0, r3)
            if (r10 != r2) goto L97
            return r2
        L97:
            int r0 = r9.zzi
            int r0 = r0 - r10
            r9.zzi = r0
            if (r0 <= 0) goto L9f
            return r1
        L9f:
            com.google.android.gms.internal.ads.zzaeh r2 = r9.zzo
            long r3 = r9.zzg
            r5 = 1
            int r6 = r9.zzh
            r7 = 0
            r8 = 0
            r2.zzs(r3, r5, r6, r7, r8)
            long r2 = r9.zzg
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.zzg = r2
            return r1
    }

    private static boolean zzg(com.google.android.gms.internal.ads.zzadc r3, byte[] r4) throws java.io.IOException {
            r3.zzj()
            int r0 = r4.length
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.zzh(r1, r2, r0)
            boolean r3 = java.util.Arrays.equals(r1, r4)
            return r3
    }

    private final boolean zzh(com.google.android.gms.internal.ads.zzadc r5) throws java.io.IOException {
            r4 = this;
            byte[] r0 = com.google.android.gms.internal.ads.zzaeo.zzc
            boolean r1 = zzg(r5, r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            r4.zzf = r2
            int r0 = r0.length
            r5.zzk(r0)
            return r3
        L11:
            byte[] r0 = com.google.android.gms.internal.ads.zzaeo.zzd
            boolean r1 = zzg(r5, r0)
            if (r1 == 0) goto L20
            r4.zzf = r3
            int r0 = r0.length
            r5.zzk(r0)
            return r3
        L20:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r8, com.google.android.gms.internal.ads.zzadx r9) throws java.io.IOException {
            r7 = this;
            com.google.android.gms.internal.ads.zzaeh r9 = r7.zzo
            com.google.android.gms.internal.ads.zzdi.zzb(r9)
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            long r0 = r8.zzf()
            r2 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L20
            boolean r9 = r7.zzh(r8)
            if (r9 == 0) goto L18
            goto L20
        L18:
            r8 = 0
            java.lang.String r9 = "Could not find AMR header."
            com.google.android.gms.internal.ads.zzbo r8 = com.google.android.gms.internal.ads.zzbo.zza(r9, r8)
            throw r8
        L20:
            boolean r9 = r7.zzq
            r0 = 1
            if (r9 != 0) goto L5f
            r7.zzq = r0
            boolean r9 = r7.zzf
            if (r0 == r9) goto L2e
            java.lang.String r1 = "audio/3gpp"
            goto L30
        L2e:
            java.lang.String r1 = "audio/amr-wb"
        L30:
            if (r0 == r9) goto L35
            r4 = 8000(0x1f40, float:1.121E-41)
            goto L37
        L35:
            r4 = 16000(0x3e80, float:2.2421E-41)
        L37:
            if (r9 == 0) goto L40
            int[] r9 = com.google.android.gms.internal.ads.zzaeo.zzb
            r5 = 8
            r9 = r9[r5]
            goto L45
        L40:
            int[] r9 = com.google.android.gms.internal.ads.zzaeo.zza
            r5 = 7
            r9 = r9[r5]
        L45:
            com.google.android.gms.internal.ads.zzaeh r5 = r7.zzo
            com.google.android.gms.internal.ads.zzad r6 = new com.google.android.gms.internal.ads.zzad
            r6.<init>()
            r6.zzZ(r1)
            r6.zzQ(r9)
            r6.zzz(r0)
            r6.zzaa(r4)
            com.google.android.gms.internal.ads.zzaf r9 = r6.zzaf()
            r5.zzl(r9)
        L5f:
            int r8 = r7.zza(r8)
            boolean r9 = r7.zzj
            if (r9 == 0) goto L68
            return r8
        L68:
            com.google.android.gms.internal.ads.zzadz r9 = new com.google.android.gms.internal.ads.zzadz
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9.<init>(r4, r2)
            r7.zzp = r9
            com.google.android.gms.internal.ads.zzade r1 = r7.zzn
            r1.zzO(r9)
            r7.zzj = r0
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ com.google.android.gms.internal.ads.zzadb zzc() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r3) {
            r2 = this;
            r2.zzn = r3
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zzw(r0, r1)
            r2.zzo = r0
            r3.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.zzg = r1
            r3 = 0
            r0.zzh = r3
            r0.zzi = r3
            r0.zzm = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = r0.zzh(r1)
            return r1
    }
}
