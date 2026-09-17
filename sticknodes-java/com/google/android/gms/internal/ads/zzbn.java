package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbn {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.ArrayList zzb = null;
    private static final java.util.regex.Pattern zzc = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzbn.zzb = r0
            java.lang.String r0 = "^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzbn.zzc = r0
            return
    }

    public static int zza(java.lang.String r7, java.lang.String r8) {
            int r0 = r7.hashCode()
            r1 = 7
            r2 = 9
            r3 = 5
            r4 = 6
            r5 = 8
            r6 = 0
            switch(r0) {
                case -2123537834: goto L85;
                case -1365340241: goto L7a;
                case -1095064472: goto L70;
                case -53558318: goto L66;
                case 187078296: goto L5c;
                case 187078297: goto L52;
                case 550520934: goto L47;
                case 1504578661: goto L3d;
                case 1504831518: goto L33;
                case 1504891608: goto L28;
                case 1505942594: goto L1d;
                case 1556697186: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L8f
        L11:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 10
            goto L90
        L1d:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 7
            goto L90
        L28:
            java.lang.String r0 = "audio/opus"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 11
            goto L90
        L33:
            java.lang.String r0 = "audio/mpeg"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 0
            goto L90
        L3d:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 3
            goto L90
        L47:
            java.lang.String r0 = "audio/vnd.dts.uhd;profile=p2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 9
            goto L90
        L52:
            java.lang.String r0 = "audio/ac4"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 5
            goto L90
        L5c:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 2
            goto L90
        L66:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 1
            goto L90
        L70:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 6
            goto L90
        L7a:
            java.lang.String r0 = "audio/vnd.dts.hd;profile=lbr"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 8
            goto L90
        L85:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8f
            r7 = 4
            goto L90
        L8f:
            r7 = -1
        L90:
            switch(r7) {
                case 0: goto Lb6;
                case 1: goto La7;
                case 2: goto La6;
                case 3: goto La5;
                case 4: goto La2;
                case 5: goto L9f;
                case 6: goto L9e;
                case 7: goto L9d;
                case 8: goto L9d;
                case 9: goto L9a;
                case 10: goto L97;
                case 11: goto L94;
                default: goto L93;
            }
        L93:
            return r6
        L94:
            r7 = 20
            return r7
        L97:
            r7 = 14
            return r7
        L9a:
            r7 = 30
            return r7
        L9d:
            return r5
        L9e:
            return r1
        L9f:
            r7 = 17
            return r7
        La2:
            r7 = 18
            return r7
        La5:
            return r4
        La6:
            return r3
        La7:
            if (r8 != 0) goto Laa
            return r6
        Laa:
            com.google.android.gms.internal.ads.zzbm r7 = zzc(r8)
            if (r7 != 0) goto Lb1
            return r6
        Lb1:
            int r7 = r7.zza()
            return r7
        Lb6:
            return r2
    }

    public static int zzb(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = zzg(r5)
            if (r0 == 0) goto L10
            r5 = 1
            return r5
        L10:
            boolean r0 = zzi(r5)
            if (r0 != 0) goto Ld3
            java.lang.String r0 = zzj(r5)
            java.lang.String r2 = "text"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/x-media3-cues"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/x-rawcc"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/pgs"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L83
            goto Ld1
        L83:
            boolean r0 = zzh(r5)
            if (r0 == 0) goto L8b
            r5 = 4
            return r5
        L8b:
            java.lang.String r0 = "application/id3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lcf
            java.lang.String r0 = "application/x-emsg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lcf
            java.lang.String r0 = "application/x-scte35"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto La4
            goto Lcf
        La4:
            java.lang.String r0 = "application/x-camera-motion"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lcd
            java.util.ArrayList r0 = com.google.android.gms.internal.ads.zzbn.zzb
            int r0 = r0.size()
            r2 = 0
            r3 = 0
        Lb4:
            if (r3 >= r0) goto Lcc
            java.util.ArrayList r4 = com.google.android.gms.internal.ads.zzbn.zzb
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.zzbl r4 = (com.google.android.gms.internal.ads.zzbl) r4
            java.lang.String r4 = r4.zza
            r4 = 0
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lc9
            r1 = 0
            goto Lcc
        Lc9:
            int r3 = r3 + 1
            goto Lb4
        Lcc:
            return r1
        Lcd:
            r5 = 6
            return r5
        Lcf:
            r5 = 5
            return r5
        Ld1:
            r5 = 3
            return r5
        Ld3:
            r5 = 2
            return r5
    }

    static com.google.android.gms.internal.ads.zzbm zzc(java.lang.String r2) {
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzbn.zzc
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r0 = r2.matches()
            if (r0 != 0) goto Ld
            goto L2e
        Ld:
            r0 = 1
            java.lang.String r0 = r2.group(r0)
            java.util.Objects.requireNonNull(r0)
            r1 = 2
            java.lang.String r2 = r2.group(r1)
            r1 = 16
            int r0 = java.lang.Integer.parseInt(r0, r1)     // Catch: java.lang.NumberFormatException -> L2e
            if (r2 == 0) goto L27
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2e
            goto L28
        L27:
            r2 = 0
        L28:
            com.google.android.gms.internal.ads.zzbm r1 = new com.google.android.gms.internal.ads.zzbm
            r1.<init>(r0, r2)
            return r1
        L2e:
            r2 = 0
            return r2
    }

    public static java.lang.String zzd(int r1) {
            r0 = 32
            if (r1 == r0) goto L5c
            r0 = 33
            if (r1 == r0) goto L59
            r0 = 35
            if (r1 == r0) goto L56
            r0 = 64
            if (r1 == r0) goto L53
            r0 = 163(0xa3, float:2.28E-43)
            if (r1 == r0) goto L50
            r0 = 177(0xb1, float:2.48E-43)
            if (r1 == r0) goto L4d
            r0 = 221(0xdd, float:3.1E-43)
            if (r1 == r0) goto L4a
            r0 = 165(0xa5, float:2.31E-43)
            if (r1 == r0) goto L47
            r0 = 166(0xa6, float:2.33E-43)
            if (r1 == r0) goto L44
            switch(r1) {
                case 96: goto L41;
                case 97: goto L41;
                case 98: goto L41;
                case 99: goto L41;
                case 100: goto L41;
                case 101: goto L41;
                case 102: goto L53;
                case 103: goto L53;
                case 104: goto L53;
                case 105: goto L3e;
                case 106: goto L3b;
                case 107: goto L3e;
                case 108: goto L38;
                default: goto L27;
            }
        L27:
            switch(r1) {
                case 169: goto L35;
                case 170: goto L32;
                case 171: goto L32;
                case 172: goto L35;
                case 173: goto L2f;
                case 174: goto L2c;
                default: goto L2a;
            }
        L2a:
            r1 = 0
            return r1
        L2c:
            java.lang.String r1 = "audio/ac4"
            return r1
        L2f:
            java.lang.String r1 = "audio/opus"
            return r1
        L32:
            java.lang.String r1 = "audio/vnd.dts.hd"
            return r1
        L35:
            java.lang.String r1 = "audio/vnd.dts"
            return r1
        L38:
            java.lang.String r1 = "image/jpeg"
            return r1
        L3b:
            java.lang.String r1 = "video/mpeg"
            return r1
        L3e:
            java.lang.String r1 = "audio/mpeg"
            return r1
        L41:
            java.lang.String r1 = "video/mpeg2"
            return r1
        L44:
            java.lang.String r1 = "audio/eac3"
            return r1
        L47:
            java.lang.String r1 = "audio/ac3"
            return r1
        L4a:
            java.lang.String r1 = "audio/vorbis"
            return r1
        L4d:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            return r1
        L50:
            java.lang.String r1 = "video/wvc1"
            return r1
        L53:
            java.lang.String r1 = "audio/mp4a-latm"
            return r1
        L56:
            java.lang.String r1 = "video/hevc"
            return r1
        L59:
            java.lang.String r1 = "video/avc"
            return r1
        L5c:
            java.lang.String r1 = "video/mp4v-es"
            return r1
    }

    public static java.lang.String zze(java.lang.String r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.lang.String r6 = com.google.android.gms.internal.ads.zzfxi.zza(r6)
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1007807498: goto L47;
                case -979095690: goto L3d;
                case -586683234: goto L33;
                case -432836268: goto L29;
                case -432836267: goto L1f;
                case 187090231: goto L15;
                default: goto L14;
            }
        L14:
            goto L51
        L15:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 1
            goto L52
        L1f:
            java.lang.String r0 = "audio/mpeg-l2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 5
            goto L52
        L29:
            java.lang.String r0 = "audio/mpeg-l1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 4
            goto L52
        L33:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 2
            goto L52
        L3d:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 3
            goto L52
        L47:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 0
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L6e
            if (r0 == r5) goto L6b
            if (r0 == r4) goto L68
            if (r0 == r3) goto L65
            if (r0 == r2) goto L62
            if (r0 == r1) goto L5f
            return r6
        L5f:
            java.lang.String r6 = "audio/mpeg-L2"
            return r6
        L62:
            java.lang.String r6 = "audio/mpeg-L1"
            return r6
        L65:
            java.lang.String r6 = "application/x-mpegURL"
            return r6
        L68:
            java.lang.String r6 = "audio/wav"
            return r6
        L6b:
            java.lang.String r6 = "audio/mpeg"
            return r6
        L6e:
            java.lang.String r6 = "audio/flac"
            return r6
    }

    public static boolean zzf(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L75;
                case -432837260: goto L6b;
                case -432837259: goto L61;
                case -53558318: goto L56;
                case 187078296: goto L4c;
                case 187094639: goto L42;
                case 1504578661: goto L37;
                case 1504619009: goto L2d;
                case 1504831518: goto L23;
                case 1903231877: goto L19;
                case 1903589369: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L80
        Le:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 5
            goto L81
        L19:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 4
            goto L81
        L23:
            java.lang.String r1 = "audio/mpeg"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 0
            goto L81
        L2d:
            java.lang.String r1 = "audio/flac"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 6
            goto L81
        L37:
            java.lang.String r1 = "audio/eac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 8
            goto L81
        L42:
            java.lang.String r1 = "audio/raw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 3
            goto L81
        L4c:
            java.lang.String r1 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 7
            goto L81
        L56:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 10
            goto L81
        L61:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 2
            goto L81
        L6b:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 1
            goto L81
        L75:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L80
            r3 = 9
            goto L81
        L80:
            r3 = -1
        L81:
            switch(r3) {
                case 0: goto L9b;
                case 1: goto L9b;
                case 2: goto L9b;
                case 3: goto L9b;
                case 4: goto L9b;
                case 5: goto L9b;
                case 6: goto L9b;
                case 7: goto L9b;
                case 8: goto L9b;
                case 9: goto L9b;
                case 10: goto L85;
                default: goto L84;
            }
        L84:
            return r0
        L85:
            if (r4 != 0) goto L88
            return r0
        L88:
            com.google.android.gms.internal.ads.zzbm r3 = zzc(r4)
            if (r3 != 0) goto L8f
            return r0
        L8f:
            int r3 = r3.zza()
            if (r3 == 0) goto L9a
            r4 = 16
            if (r3 == r4) goto L9a
            return r2
        L9a:
            return r0
        L9b:
            return r2
    }

    public static boolean zzg(java.lang.String r1) {
            java.lang.String r1 = zzj(r1)
            java.lang.String r0 = "audio"
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean zzh(java.lang.String r2) {
            java.lang.String r0 = zzj(r2)
            java.lang.String r1 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "application/x-image-uri"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public static boolean zzi(java.lang.String r1) {
            java.lang.String r1 = zzj(r1)
            java.lang.String r0 = "video"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static java.lang.String zzj(java.lang.String r2) {
            if (r2 != 0) goto L3
            goto L12
        L3:
            r0 = 47
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L12
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
        L12:
            r2 = 0
            return r2
    }
}
