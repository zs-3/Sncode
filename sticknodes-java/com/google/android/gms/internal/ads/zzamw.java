package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamw implements com.google.android.gms.internal.ads.zzaom {
    private final java.util.List zza;

    public zzamw() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public zzamw(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzn()
            r0.<init>()
            r0.zza = r1
            return
    }

    public zzamw(int r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    private final com.google.android.gms.internal.ads.zzaod zzc(com.google.android.gms.internal.ads.zzaol r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaod r0 = new com.google.android.gms.internal.ads.zzaod
            java.util.List r2 = r1.zze(r2)
            r0.<init>(r2)
            return r0
    }

    private final com.google.android.gms.internal.ads.zzaoq zzd(com.google.android.gms.internal.ads.zzaol r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaoq r0 = new com.google.android.gms.internal.ads.zzaoq
            java.util.List r2 = r1.zze(r2)
            r0.<init>(r2)
            return r0
    }

    private final java.util.List zze(com.google.android.gms.internal.ads.zzaol r12) {
            r11 = this;
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            byte[] r12 = r12.zze
            r0.<init>(r12)
            java.util.List r12 = r11.zza
        L9:
            int r1 = r0.zzb()
            if (r1 <= 0) goto L8b
            int r1 = r0.zzm()
            int r2 = r0.zzm()
            int r3 = r0.zzd()
            int r3 = r3 + r2
            r2 = 134(0x86, float:1.88E-43)
            if (r1 != r2) goto L86
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r1 = r0.zzm()
            r1 = r1 & 31
            r2 = 0
            r4 = 0
        L2d:
            if (r4 >= r1) goto L86
            r5 = 3
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r5 = r0.zzB(r5, r6)
            int r6 = r0.zzm()
            r7 = r6 & 128(0x80, float:1.794E-43)
            r8 = 1
            if (r7 == 0) goto L41
            r7 = 1
            goto L42
        L41:
            r7 = 0
        L42:
            if (r7 == 0) goto L49
            r6 = r6 & 63
            java.lang.String r9 = "application/cea-708"
            goto L4c
        L49:
            java.lang.String r9 = "application/cea-608"
            r6 = 1
        L4c:
            int r10 = r0.zzm()
            byte r10 = (byte) r10
            r0.zzM(r8)
            if (r7 == 0) goto L6a
            r7 = r10 & 64
            int r10 = com.google.android.gms.internal.ads.zzdk.zza
            if (r7 == 0) goto L61
            byte[] r7 = new byte[r8]
            r7[r2] = r8
            goto L65
        L61:
            byte[] r7 = new byte[r8]
            r7[r2] = r2
        L65:
            java.util.List r7 = java.util.Collections.singletonList(r7)
            goto L6b
        L6a:
            r7 = 0
        L6b:
            com.google.android.gms.internal.ads.zzad r8 = new com.google.android.gms.internal.ads.zzad
            r8.<init>()
            r8.zzZ(r9)
            r8.zzP(r5)
            r8.zzx(r6)
            r8.zzM(r7)
            com.google.android.gms.internal.ads.zzaf r5 = r8.zzaf()
            r12.add(r5)
            int r4 = r4 + 1
            goto L2d
        L86:
            r0.zzL(r3)
            goto L9
        L8b:
            return r12
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final android.util.SparseArray zza() {
            r1 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final com.google.android.gms.internal.ads.zzaoo zzb(int r4, com.google.android.gms.internal.ads.zzaol r5) {
            r3 = this;
            r0 = 2
            if (r4 == r0) goto L123
            r0 = 3
            if (r4 == r0) goto L112
            r0 = 4
            if (r4 == r0) goto L112
            r0 = 21
            if (r4 == r0) goto L107
            r0 = 27
            r1 = 0
            if (r4 == r0) goto Lf8
            r0 = 36
            if (r4 == r0) goto Le9
            r0 = 45
            if (r4 == r0) goto Lde
            r0 = 89
            if (r4 == r0) goto Ld1
            r0 = 172(0xac, float:2.41E-43)
            if (r4 == r0) goto Lc0
            r0 = 257(0x101, float:3.6E-43)
            if (r4 == r0) goto Lb3
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == r0) goto L123
            r0 = 129(0x81, float:1.81E-43)
            if (r4 == r0) goto La2
            r0 = 138(0x8a, float:1.93E-43)
            if (r4 == r0) goto L8f
            r0 = 139(0x8b, float:1.95E-43)
            if (r4 == r0) goto L7c
            switch(r4) {
                case 15: goto L6b;
                case 16: goto L5c;
                case 17: goto L4b;
                default: goto L39;
            }
        L39:
            switch(r4) {
                case 134: goto L3e;
                case 135: goto La2;
                case 136: goto L8f;
                default: goto L3c;
            }
        L3c:
            r4 = 0
            return r4
        L3e:
            com.google.android.gms.internal.ads.zzaob r4 = new com.google.android.gms.internal.ads.zzaob
            com.google.android.gms.internal.ads.zzans r5 = new com.google.android.gms.internal.ads.zzans
            java.lang.String r0 = "application/x-scte35"
            r5.<init>(r0)
            r4.<init>(r5)
            return r4
        L4b:
            java.lang.String r4 = r5.zzb
            com.google.android.gms.internal.ads.zzant r0 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzank r1 = new com.google.android.gms.internal.ads.zzank
            int r5 = r5.zza()
            r1.<init>(r4, r5)
            r0.<init>(r1)
            return r0
        L5c:
            com.google.android.gms.internal.ads.zzant r4 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzane r0 = new com.google.android.gms.internal.ads.zzane
            com.google.android.gms.internal.ads.zzaoq r5 = r3.zzd(r5)
            r0.<init>(r5)
            r4.<init>(r0)
            return r4
        L6b:
            java.lang.String r4 = r5.zzb
            com.google.android.gms.internal.ads.zzant r0 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzamv r2 = new com.google.android.gms.internal.ads.zzamv
            int r5 = r5.zza()
            r2.<init>(r1, r4, r5)
            r0.<init>(r2)
            return r0
        L7c:
            java.lang.String r4 = r5.zzb
            com.google.android.gms.internal.ads.zzant r0 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzamx r1 = new com.google.android.gms.internal.ads.zzamx
            int r5 = r5.zza()
            r2 = 5408(0x1520, float:7.578E-42)
            r1.<init>(r4, r5, r2)
            r0.<init>(r1)
            return r0
        L8f:
            java.lang.String r4 = r5.zzb
            com.google.android.gms.internal.ads.zzant r0 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzamx r1 = new com.google.android.gms.internal.ads.zzamx
            int r5 = r5.zza()
            r2 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r4, r5, r2)
            r0.<init>(r1)
            return r0
        La2:
            java.lang.String r4 = r5.zzb
            com.google.android.gms.internal.ads.zzant r0 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzamr r1 = new com.google.android.gms.internal.ads.zzamr
            int r5 = r5.zza()
            r1.<init>(r4, r5)
            r0.<init>(r1)
            return r0
        Lb3:
            com.google.android.gms.internal.ads.zzaob r4 = new com.google.android.gms.internal.ads.zzaob
            com.google.android.gms.internal.ads.zzans r5 = new com.google.android.gms.internal.ads.zzans
            java.lang.String r0 = "application/vnd.dvb.ait"
            r5.<init>(r0)
            r4.<init>(r5)
            return r4
        Lc0:
            java.lang.String r4 = r5.zzb
            com.google.android.gms.internal.ads.zzant r0 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzamt r1 = new com.google.android.gms.internal.ads.zzamt
            int r5 = r5.zza()
            r1.<init>(r4, r5)
            r0.<init>(r1)
            return r0
        Ld1:
            java.util.List r4 = r5.zzd
            com.google.android.gms.internal.ads.zzant r5 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzamy r0 = new com.google.android.gms.internal.ads.zzamy
            r0.<init>(r4)
            r5.<init>(r0)
            return r5
        Lde:
            com.google.android.gms.internal.ads.zzant r4 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzanm r5 = new com.google.android.gms.internal.ads.zzanm
            r5.<init>()
            r4.<init>(r5)
            return r4
        Le9:
            com.google.android.gms.internal.ads.zzant r4 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzani r0 = new com.google.android.gms.internal.ads.zzani
            com.google.android.gms.internal.ads.zzaod r5 = r3.zzc(r5)
            r0.<init>(r5)
            r4.<init>(r0)
            return r4
        Lf8:
            com.google.android.gms.internal.ads.zzant r4 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzang r0 = new com.google.android.gms.internal.ads.zzang
            com.google.android.gms.internal.ads.zzaod r5 = r3.zzc(r5)
            r0.<init>(r5, r1, r1)
            r4.<init>(r0)
            return r4
        L107:
            com.google.android.gms.internal.ads.zzant r4 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzanj r5 = new com.google.android.gms.internal.ads.zzanj
            r5.<init>()
            r4.<init>(r5)
            return r4
        L112:
            java.lang.String r4 = r5.zzb
            com.google.android.gms.internal.ads.zzant r0 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzanl r1 = new com.google.android.gms.internal.ads.zzanl
            int r5 = r5.zza()
            r1.<init>(r4, r5)
            r0.<init>(r1)
            return r0
        L123:
            com.google.android.gms.internal.ads.zzant r4 = new com.google.android.gms.internal.ads.zzant
            com.google.android.gms.internal.ads.zzanb r0 = new com.google.android.gms.internal.ads.zzanb
            com.google.android.gms.internal.ads.zzaoq r5 = r3.zzd(r5)
            r0.<init>(r5)
            r4.<init>(r0)
            return r4
    }
}
