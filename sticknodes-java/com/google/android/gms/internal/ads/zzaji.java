package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaji {
    public static com.google.android.gms.internal.ads.zzbj zza(com.google.android.gms.internal.ads.zzek r13) {
            int r0 = r13.zzd()
            int r1 = r13.zzg()
            int r0 = r0 + r1
            int r1 = r13.zzg()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "TCON"
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r6 = "MetadataUtil"
            r7 = 0
            r8 = 169(0xa9, float:2.37E-43)
            if (r2 == r8) goto L1be
            r8 = 253(0xfd, float:3.55E-43)
            if (r2 != r8) goto L26
            goto L1be
        L26:
            r2 = 1735291493(0x676e7265, float:1.1260334E24)
            r8 = -1
            if (r1 != r2) goto L4a
            int r1 = zzb(r13)     // Catch: java.lang.Throwable -> L1f2
            int r1 = r1 + r8
            java.lang.String r1 = com.google.android.gms.internal.ads.zzagw.zza(r1)     // Catch: java.lang.Throwable -> L1f2
            if (r1 == 0) goto L43
            com.google.android.gms.internal.ads.zzahe r2 = new com.google.android.gms.internal.ads.zzahe     // Catch: java.lang.Throwable -> L1f2
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzo(r1)     // Catch: java.lang.Throwable -> L1f2
            r2.<init>(r3, r7, r1)     // Catch: java.lang.Throwable -> L1f2
            r7 = r2
            goto L286
        L43:
            java.lang.String r1 = "Failed to parse standard genre code"
            com.google.android.gms.internal.ads.zzea.zzf(r6, r1)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L4a:
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r1 != r2) goto L57
            java.lang.String r1 = "TPOS"
            com.google.android.gms.internal.ads.zzahe r7 = zzd(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L57:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r1 != r2) goto L64
            java.lang.String r1 = "TRCK"
            com.google.android.gms.internal.ads.zzahe r7 = zzd(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L64:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 1
            r9 = 0
            if (r1 != r2) goto L73
            java.lang.String r1 = "TBPM"
            com.google.android.gms.internal.ads.zzagv r7 = zzc(r2, r1, r13, r3, r9)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L73:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r1 != r2) goto L80
            java.lang.String r1 = "TCMP"
            com.google.android.gms.internal.ads.zzagv r7 = zzc(r2, r1, r13, r3, r3)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L80:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r1 != r2) goto Ld8
            int r1 = r13.zzg()     // Catch: java.lang.Throwable -> L1f2
            int r2 = r13.zzg()     // Catch: java.lang.Throwable -> L1f2
            if (r2 != r5) goto Ld1
            int r2 = r13.zzg()     // Catch: java.lang.Throwable -> L1f2
            r2 = r2 & r4
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L9d
            java.lang.String r3 = "image/jpeg"
            goto La5
        L9d:
            if (r2 != r4) goto La4
            java.lang.String r3 = "image/png"
            r2 = 14
            goto La5
        La4:
            r3 = r7
        La5:
            if (r3 != 0) goto Lbd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f2
            r1.<init>()     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L1f2
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f2
            com.google.android.gms.internal.ads.zzea.zzf(r6, r1)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        Lbd:
            r2 = 4
            r13.zzM(r2)     // Catch: java.lang.Throwable -> L1f2
            int r1 = r1 + (-16)
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L1f2
            r13.zzH(r2, r9, r1)     // Catch: java.lang.Throwable -> L1f2
            com.google.android.gms.internal.ads.zzagh r1 = new com.google.android.gms.internal.ads.zzagh     // Catch: java.lang.Throwable -> L1f2
            r4 = 3
            r1.<init>(r3, r7, r4, r2)     // Catch: java.lang.Throwable -> L1f2
            r7 = r1
            goto L286
        Ld1:
            java.lang.String r1 = "Failed to parse cover art attribute"
            com.google.android.gms.internal.ads.zzea.zzf(r6, r1)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        Ld8:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r1 != r2) goto Le5
            java.lang.String r1 = "TPE2"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        Le5:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r1 != r2) goto Lf2
            java.lang.String r1 = "TSOT"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        Lf2:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r1 != r2) goto Lff
            java.lang.String r1 = "TSOA"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        Lff:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r1 != r2) goto L10c
            java.lang.String r1 = "TSOP"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L10c:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r1 != r2) goto L119
            java.lang.String r1 = "TSO2"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L119:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r1 != r2) goto L126
            java.lang.String r1 = "TSOC"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r2, r1, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L126:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r1 != r2) goto L133
            java.lang.String r1 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzagv r7 = zzc(r2, r1, r13, r9, r9)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L133:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r1 != r2) goto L140
            java.lang.String r1 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzagv r7 = zzc(r2, r1, r13, r9, r3)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L140:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r1 != r2) goto L150
            r1 = 1936683886(0x736f736e, float:1.8971255E31)
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L150:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r1 != r2) goto L160
            r1 = 1953919848(0x74767368, float:7.810338E31)
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L160:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r1 != r2) goto L260
            r1 = r7
            r2 = r1
            r3 = -1
            r4 = -1
        L169:
            int r6 = r13.zzd()     // Catch: java.lang.Throwable -> L1f2
            if (r6 >= r0) goto L1a1
            int r6 = r13.zzd()     // Catch: java.lang.Throwable -> L1f2
            int r9 = r13.zzg()     // Catch: java.lang.Throwable -> L1f2
            int r10 = r13.zzg()     // Catch: java.lang.Throwable -> L1f2
            r11 = 4
            r13.zzM(r11)     // Catch: java.lang.Throwable -> L1f2
            r11 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r10 != r11) goto L18b
            int r9 = r9 + (-12)
            java.lang.String r1 = r13.zzA(r9)     // Catch: java.lang.Throwable -> L1f2
            goto L169
        L18b:
            int r11 = r9 + (-12)
            r12 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r10 != r12) goto L197
            java.lang.String r2 = r13.zzA(r11)     // Catch: java.lang.Throwable -> L1f2
            goto L169
        L197:
            if (r10 != r5) goto L19a
            r4 = r9
        L19a:
            if (r10 != r5) goto L19d
            r3 = r6
        L19d:
            r13.zzM(r11)     // Catch: java.lang.Throwable -> L1f2
            goto L169
        L1a1:
            if (r1 == 0) goto L286
            if (r2 == 0) goto L286
            if (r3 != r8) goto L1a9
            goto L286
        L1a9:
            r13.zzL(r3)     // Catch: java.lang.Throwable -> L1f2
            r3 = 16
            r13.zzM(r3)     // Catch: java.lang.Throwable -> L1f2
            int r4 = r4 + (-16)
            java.lang.String r3 = r13.zzA(r4)     // Catch: java.lang.Throwable -> L1f2
            com.google.android.gms.internal.ads.zzagy r7 = new com.google.android.gms.internal.ads.zzagy     // Catch: java.lang.Throwable -> L1f2
            r7.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L1be:
            r2 = r1 & r4
            r4 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r4) goto L1f5
            int r2 = r13.zzg()     // Catch: java.lang.Throwable -> L1f2
            int r3 = r13.zzg()     // Catch: java.lang.Throwable -> L1f2
            if (r3 != r5) goto L1e3
            r1 = 8
            r13.zzM(r1)     // Catch: java.lang.Throwable -> L1f2
            int r2 = r2 + (-16)
            java.lang.String r1 = r13.zzA(r2)     // Catch: java.lang.Throwable -> L1f2
            com.google.android.gms.internal.ads.zzagp r7 = new com.google.android.gms.internal.ads.zzagp     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r2 = "und"
            r7.<init>(r2, r1, r1)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L1e3:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaio.zzf(r1)     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L1f2
            com.google.android.gms.internal.ads.zzea.zzf(r6, r1)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L1f2:
            r1 = move-exception
            goto L28a
        L1f5:
            r4 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r4) goto L280
            r4 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r4) goto L201
            goto L280
        L201:
            r4 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r4) goto L279
            r4 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r4) goto L20d
            goto L279
        L20d:
            r4 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r4) goto L21a
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L21a:
            r4 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r4) goto L226
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L226:
            r4 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r4) goto L232
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L232:
            r4 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r4) goto L23e
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L23e:
            r4 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r4) goto L24a
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L24a:
            r4 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r4) goto L254
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r3, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L254:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L260
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L260:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaio.zzf(r1)     // Catch: java.lang.Throwable -> L1f2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f2
            r2.<init>()     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r3 = "Skipped unknown metadata entry: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1f2
            r2.append(r1)     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1f2
            com.google.android.gms.internal.ads.zzea.zzb(r6, r1)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L279:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
            goto L286
        L280:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzahe r7 = zze(r1, r2, r13)     // Catch: java.lang.Throwable -> L1f2
        L286:
            r13.zzL(r0)
            return r7
        L28a:
            r13.zzL(r0)
            throw r1
    }

    private static int zzb(com.google.android.gms.internal.ads.zzek r3) {
            int r0 = r3.zzg()
            int r1 = r3.zzg()
            r2 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r2) goto L3d
            r1 = 8
            r3.zzM(r1)
            int r0 = r0 + (-16)
            r1 = 1
            if (r0 == r1) goto L38
            r1 = 2
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L2e
            r1 = 4
            if (r0 == r1) goto L21
            goto L3d
        L21:
            int r0 = r3.zzf()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L3d
            int r3 = r3.zzp()
            return r3
        L2e:
            int r3 = r3.zzo()
            return r3
        L33:
            int r3 = r3.zzq()
            return r3
        L38:
            int r3 = r3.zzm()
            return r3
        L3d:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse data atom to int"
            com.google.android.gms.internal.ads.zzea.zzf(r3, r0)
            r3 = -1
            return r3
    }

    private static com.google.android.gms.internal.ads.zzagv zzc(int r0, java.lang.String r1, com.google.android.gms.internal.ads.zzek r2, boolean r3, boolean r4) {
            int r2 = zzb(r2)
            if (r4 == 0) goto Lb
            r4 = 1
            int r2 = java.lang.Math.min(r4, r2)
        Lb:
            r4 = 0
            if (r2 < 0) goto L2a
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.ads.zzahe r0 = new com.google.android.gms.internal.ads.zzahe
            java.lang.String r2 = java.lang.Integer.toString(r2)
            com.google.android.gms.internal.ads.zzgax r2 = com.google.android.gms.internal.ads.zzgax.zzo(r2)
            r0.<init>(r1, r4, r2)
            goto L29
        L1e:
            com.google.android.gms.internal.ads.zzagp r0 = new com.google.android.gms.internal.ads.zzagp
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r3 = "und"
            r0.<init>(r3, r1, r2)
        L29:
            return r0
        L2a:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaio.zzf(r0)
            java.lang.String r1 = "Failed to parse uint8 attribute: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "MetadataUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r1, r0)
            return r4
    }

    private static com.google.android.gms.internal.ads.zzahe zzd(int r4, java.lang.String r5, com.google.android.gms.internal.ads.zzek r6) {
            int r0 = r6.zzg()
            int r1 = r6.zzg()
            r2 = 0
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r3) goto L4d
            r1 = 22
            if (r0 < r1) goto L4d
            r0 = 10
            r6.zzM(r0)
            int r0 = r6.zzq()
            if (r0 <= 0) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            int r6 = r6.zzq()
            if (r6 <= 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "/"
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
        L43:
            com.google.android.gms.internal.ads.zzahe r6 = new com.google.android.gms.internal.ads.zzahe
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzgax.zzo(r4)
            r6.<init>(r5, r2, r4)
            return r6
        L4d:
            java.lang.String r4 = com.google.android.gms.internal.ads.zzaio.zzf(r4)
            java.lang.String r5 = "Failed to parse index/count attribute: "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r5 = "MetadataUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r4)
            return r2
    }

    private static com.google.android.gms.internal.ads.zzahe zze(int r4, java.lang.String r5, com.google.android.gms.internal.ads.zzek r6) {
            int r0 = r6.zzg()
            int r1 = r6.zzg()
            r2 = 0
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r3) goto L23
            r4 = 8
            r6.zzM(r4)
            int r0 = r0 + (-16)
            java.lang.String r4 = r6.zzA(r0)
            com.google.android.gms.internal.ads.zzahe r6 = new com.google.android.gms.internal.ads.zzahe
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzgax.zzo(r4)
            r6.<init>(r5, r2, r4)
            return r6
        L23:
            java.lang.String r4 = com.google.android.gms.internal.ads.zzaio.zzf(r4)
            java.lang.String r5 = "Failed to parse text attribute: "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r5 = "MetadataUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r4)
            return r2
    }
}
