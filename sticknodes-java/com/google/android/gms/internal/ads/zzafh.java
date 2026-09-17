package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzafh extends com.google.android.gms.internal.ads.zzafl {
    private static final int[] zzb = null;
    private boolean zzc;
    private boolean zzd;
    private int zze;

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [5512, 11025, 22050, 44100} // fill-array
            com.google.android.gms.internal.ads.zzafh.zzb = r0
            return
    }

    public zzafh(com.google.android.gms.internal.ads.zzaeh r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zza(com.google.android.gms.internal.ads.zzek r4) throws com.google.android.gms.internal.ads.zzafk {
            r3 = this;
            boolean r0 = r3.zzc
            r1 = 1
            if (r0 != 0) goto L7c
            int r4 = r4.zzm()
            int r0 = r4 >> 4
            r3.zze = r0
            r2 = 2
            if (r0 != r2) goto L33
            int r4 = r4 >> r2
            int[] r0 = com.google.android.gms.internal.ads.zzafh.zzb
            r4 = r4 & 3
            r4 = r0[r4]
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r2 = "audio/mpeg"
            r0.zzZ(r2)
            r0.zzz(r1)
            r0.zzaa(r4)
            com.google.android.gms.internal.ads.zzaf r4 = r0.zzaf()
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zza
            r0.zzl(r4)
            r3.zzd = r1
            goto L79
        L33:
            r4 = 7
            if (r0 == r4) goto L57
            r2 = 8
            if (r0 != r2) goto L3b
            goto L57
        L3b:
            r4 = 10
            if (r0 != r4) goto L40
            goto L79
        L40:
            com.google.android.gms.internal.ads.zzafk r4 = new com.google.android.gms.internal.ads.zzafk
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Audio format not supported: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L57:
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            if (r0 != r4) goto L61
            java.lang.String r4 = "audio/g711-alaw"
            goto L63
        L61:
            java.lang.String r4 = "audio/g711-mlaw"
        L63:
            r2.zzZ(r4)
            r2.zzz(r1)
            r4 = 8000(0x1f40, float:1.121E-41)
            r2.zzaa(r4)
            com.google.android.gms.internal.ads.zzaf r4 = r2.zzaf()
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zza
            r0.zzl(r4)
            r3.zzd = r1
        L79:
            r3.zzc = r1
            goto L7f
        L7c:
            r4.zzM(r1)
        L7f:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zzb(com.google.android.gms.internal.ads.zzek r13, long r14) throws com.google.android.gms.internal.ads.zzbo {
            r12 = this;
            int r0 = r12.zze
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L19
            int r7 = r13.zzb()
            com.google.android.gms.internal.ads.zzaeh r0 = r12.zza
            r0.zzq(r13, r7)
            com.google.android.gms.internal.ads.zzaeh r3 = r12.zza
            r6 = 1
            r8 = 0
            r9 = 0
            r4 = r14
            r3.zzs(r4, r6, r7, r8, r9)
            return r1
        L19:
            int r0 = r13.zzm()
            r2 = 0
            if (r0 != 0) goto L5e
            boolean r3 = r12.zzd
            if (r3 == 0) goto L25
            goto L5e
        L25:
            int r14 = r13.zzb()
            byte[] r15 = new byte[r14]
            r13.zzH(r15, r2, r14)
            com.google.android.gms.internal.ads.zzabx r13 = com.google.android.gms.internal.ads.zzaby.zza(r15)
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>()
            java.lang.String r0 = "audio/mp4a-latm"
            r14.zzZ(r0)
            java.lang.String r0 = r13.zzc
            r14.zzA(r0)
            int r0 = r13.zzb
            r14.zzz(r0)
            int r13 = r13.zza
            r14.zzaa(r13)
            java.util.List r13 = java.util.Collections.singletonList(r15)
            r14.zzM(r13)
            com.google.android.gms.internal.ads.zzaf r13 = r14.zzaf()
            com.google.android.gms.internal.ads.zzaeh r14 = r12.zza
            r14.zzl(r13)
            r12.zzd = r1
            return r2
        L5e:
            int r3 = r12.zze
            r4 = 10
            if (r3 != r4) goto L68
            if (r0 != r1) goto L67
            goto L68
        L67:
            return r2
        L68:
            int r9 = r13.zzb()
            com.google.android.gms.internal.ads.zzaeh r0 = r12.zza
            r0.zzq(r13, r9)
            com.google.android.gms.internal.ads.zzaeh r5 = r12.zza
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r14
            r5.zzs(r6, r8, r9, r10, r11)
            return r1
    }
}
