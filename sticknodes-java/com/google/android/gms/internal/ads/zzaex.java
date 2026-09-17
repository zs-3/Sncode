package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaex implements com.google.android.gms.internal.ads.zzaep {
    public final com.google.android.gms.internal.ads.zzgax zza;
    private final int zzb;

    private zzaex(int r1, com.google.android.gms.internal.ads.zzgax r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zza = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzaex zzc(int r16, com.google.android.gms.internal.ads.zzek r17) {
            r0 = r17
            com.google.android.gms.internal.ads.zzgau r1 = new com.google.android.gms.internal.ads.zzgau
            r1.<init>()
            int r2 = r17.zze()
            r3 = -2
        Lc:
            int r4 = r17.zzb()
            r5 = 8
            if (r4 <= r5) goto L192
            int r4 = r17.zzi()
            int r5 = r17.zzi()
            int r6 = r17.zzd()
            int r6 = r6 + r5
            r0.zzK(r6)
            r5 = 1414744396(0x5453494c, float:3.62987127E12)
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 != r5) goto L36
            int r4 = r17.zzi()
            com.google.android.gms.internal.ads.zzaex r9 = zzc(r4, r0)
            goto L14e
        L36:
            switch(r4) {
                case 1718776947: goto L4d;
                case 1751742049: goto L47;
                case 1752331379: goto L41;
                case 1852994675: goto L3b;
                default: goto L39;
            }
        L39:
            goto L14e
        L3b:
            com.google.android.gms.internal.ads.zzaez r9 = com.google.android.gms.internal.ads.zzaez.zzb(r17)
            goto L14e
        L41:
            com.google.android.gms.internal.ads.zzaev r9 = com.google.android.gms.internal.ads.zzaev.zzb(r17)
            goto L14e
        L47:
            com.google.android.gms.internal.ads.zzaeu r9 = com.google.android.gms.internal.ads.zzaeu.zzb(r17)
            goto L14e
        L4d:
            java.lang.String r4 = "StreamFormatChunk"
            if (r3 != r7) goto La8
            r5 = 4
            r0.zzM(r5)
            int r10 = r17.zzi()
            int r11 = r17.zzi()
            r0.zzM(r5)
            int r5 = r17.zzi()
            switch(r5) {
                case 808802372: goto L75;
                case 826496577: goto L72;
                case 828601953: goto L72;
                case 842289229: goto L6f;
                case 859066445: goto L6c;
                case 875967048: goto L72;
                case 877677894: goto L75;
                case 1145656883: goto L75;
                case 1145656920: goto L75;
                case 1196444237: goto L69;
                case 1482049860: goto L75;
                case 1684633208: goto L75;
                case 1735420525: goto L69;
                case 2021026148: goto L75;
                default: goto L67;
            }
        L67:
            r12 = r9
            goto L77
        L69:
            java.lang.String r12 = "video/mjpeg"
            goto L77
        L6c:
            java.lang.String r12 = "video/mp43"
            goto L77
        L6f:
            java.lang.String r12 = "video/mp42"
            goto L77
        L72:
            java.lang.String r12 = "video/avc"
            goto L77
        L75:
            java.lang.String r12 = "video/mp4v-es"
        L77:
            if (r12 != 0) goto L8f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Ignoring track with unsupported compression "
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r5)
            goto L14e
        L8f:
            com.google.android.gms.internal.ads.zzad r4 = new com.google.android.gms.internal.ads.zzad
            r4.<init>()
            r4.zzae(r10)
            r4.zzJ(r11)
            r4.zzZ(r12)
            com.google.android.gms.internal.ads.zzaey r9 = new com.google.android.gms.internal.ads.zzaey
            com.google.android.gms.internal.ads.zzaf r4 = r4.zzaf()
            r9.<init>(r4)
            goto L14e
        La8:
            if (r3 != r8) goto L141
            int r5 = r17.zzk()
            java.lang.String r10 = "audio/mp4a-latm"
            java.lang.String r11 = "audio/raw"
            if (r5 == r8) goto Ld1
            r12 = 85
            if (r5 == r12) goto Lce
            r12 = 255(0xff, float:3.57E-43)
            if (r5 == r12) goto Lcc
            r12 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r12) goto Lc9
            r12 = 8193(0x2001, float:1.1481E-41)
            if (r5 == r12) goto Lc6
            r12 = r9
            goto Ld2
        Lc6:
            java.lang.String r12 = "audio/vnd.dts"
            goto Ld2
        Lc9:
            java.lang.String r12 = "audio/ac3"
            goto Ld2
        Lcc:
            r12 = r10
            goto Ld2
        Lce:
            java.lang.String r12 = "audio/mpeg"
            goto Ld2
        Ld1:
            r12 = r11
        Ld2:
            if (r12 != 0) goto Le9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Ignoring track with unsupported format tag "
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r5)
            goto L14e
        Le9:
            int r4 = r17.zzk()
            int r5 = r17.zzi()
            r9 = 6
            r0.zzM(r9)
            int r9 = r17.zzk()
            int r9 = com.google.android.gms.internal.ads.zzeu.zzm(r9)
            int r13 = r17.zzb()
            r14 = 0
            if (r13 <= 0) goto L109
            int r13 = r17.zzk()
            goto L10a
        L109:
            r13 = 0
        L10a:
            byte[] r15 = new byte[r13]
            r0.zzH(r15, r14, r13)
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>()
            r14.zzZ(r12)
            r14.zzz(r4)
            r14.zzaa(r5)
            boolean r4 = r11.equals(r12)
            if (r4 == 0) goto L128
            if (r9 == 0) goto L128
            r14.zzT(r9)
        L128:
            boolean r4 = r10.equals(r12)
            if (r4 == 0) goto L137
            if (r13 <= 0) goto L137
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzgax.zzo(r15)
            r14.zzM(r4)
        L137:
            com.google.android.gms.internal.ads.zzaey r9 = new com.google.android.gms.internal.ads.zzaey
            com.google.android.gms.internal.ads.zzaf r4 = r14.zzaf()
            r9.<init>(r4)
            goto L14e
        L141:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzeu.zzC(r3)
            java.lang.String r10 = "Ignoring strf box for unsupported track type: "
            java.lang.String r5 = r10.concat(r5)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r5)
        L14e:
            if (r9 == 0) goto L18a
            int r4 = r9.zza()
            r5 = 1752331379(0x68727473, float:4.5798432E24)
            if (r4 != r5) goto L187
            r3 = r9
            com.google.android.gms.internal.ads.zzaev r3 = (com.google.android.gms.internal.ads.zzaev) r3
            int r3 = r3.zza
            r4 = 1935960438(0x73646976, float:1.809666E31)
            if (r3 == r4) goto L186
            r4 = 1935963489(0x73647561, float:1.8100348E31)
            if (r3 == r4) goto L184
            r4 = 1937012852(0x73747874, float:1.936895E31)
            if (r3 == r4) goto L182
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Found unsupported streamType fourCC: "
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r4 = "AviStreamHeaderChunk"
            com.google.android.gms.internal.ads.zzea.zzf(r4, r3)
            r3 = -1
            goto L187
        L182:
            r3 = 3
            goto L187
        L184:
            r3 = 1
            goto L187
        L186:
            r3 = 2
        L187:
            r1.zzf(r9)
        L18a:
            r0.zzL(r6)
            r0.zzK(r2)
            goto Lc
        L192:
            com.google.android.gms.internal.ads.zzaex r0 = new com.google.android.gms.internal.ads.zzaex
            com.google.android.gms.internal.ads.zzgax r1 = r1.zzi()
            r2 = r16
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final int zza() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaep zzb(java.lang.Class r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r5.zza
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.ads.zzaep r3 = (com.google.android.gms.internal.ads.zzaep) r3
            java.lang.Class r4 = r3.getClass()
            int r2 = r2 + 1
            if (r4 != r6) goto L7
            return r3
        L18:
            r6 = 0
            return r6
    }
}
