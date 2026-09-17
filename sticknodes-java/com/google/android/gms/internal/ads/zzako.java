package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzako implements com.google.android.gms.internal.ads.zzakt {
    public zzako() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final int zza(com.google.android.gms.internal.ads.zzaf r4) {
            r3 = this;
            java.lang.String r4 = r4.zzn
            if (r4 == 0) goto L68
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 2
            switch(r0) {
                case -1351681404: goto L54;
                case -1248334819: goto L4a;
                case -1026075066: goto L40;
                case -1004728940: goto L36;
                case 691401887: goto L2c;
                case 822864842: goto L22;
                case 1668750253: goto L18;
                case 1693976202: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L5e
        Le:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 7
            goto L5f
        L18:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 3
            goto L5f
        L22:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 0
            goto L5f
        L2c:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 4
            goto L5f
        L36:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 1
            goto L5f
        L40:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 2
            goto L5f
        L4a:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 5
            goto L5f
        L54:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 6
            goto L5f
        L5e:
            r0 = -1
        L5f:
            switch(r0) {
                case 0: goto L67;
                case 1: goto L67;
                case 2: goto L66;
                case 3: goto L65;
                case 4: goto L64;
                case 5: goto L64;
                case 6: goto L64;
                case 7: goto L63;
                default: goto L62;
            }
        L62:
            goto L68
        L63:
            return r1
        L64:
            return r2
        L65:
            return r1
        L66:
            return r2
        L67:
            return r1
        L68:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final com.google.android.gms.internal.ads.zzakv zzb(com.google.android.gms.internal.ads.zzaf r3) {
            r2 = this;
            java.lang.String r0 = r3.zzn
            if (r0 == 0) goto L97
            int r1 = r0.hashCode()
            switch(r1) {
                case -1351681404: goto L52;
                case -1248334819: goto L48;
                case -1026075066: goto L3e;
                case -1004728940: goto L34;
                case 691401887: goto L2a;
                case 822864842: goto L20;
                case 1668750253: goto L16;
                case 1693976202: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L5c
        Lc:
            java.lang.String r1 = "application/ttml+xml"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 7
            goto L5d
        L16:
            java.lang.String r1 = "application/x-subrip"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 3
            goto L5d
        L20:
            java.lang.String r1 = "text/x-ssa"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 0
            goto L5d
        L2a:
            java.lang.String r1 = "application/x-quicktime-tx3g"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 4
            goto L5d
        L34:
            java.lang.String r1 = "text/vtt"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 1
            goto L5d
        L3e:
            java.lang.String r1 = "application/x-mp4-vtt"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 2
            goto L5d
        L48:
            java.lang.String r1 = "application/pgs"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 5
            goto L5d
        L52:
            java.lang.String r1 = "application/dvbsubs"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 6
            goto L5d
        L5c:
            r1 = -1
        L5d:
            switch(r1) {
                case 0: goto L8f;
                case 1: goto L89;
                case 2: goto L83;
                case 3: goto L7d;
                case 4: goto L75;
                case 5: goto L6f;
                case 6: goto L67;
                case 7: goto L61;
                default: goto L60;
            }
        L60:
            goto L97
        L61:
            com.google.android.gms.internal.ads.zzalv r3 = new com.google.android.gms.internal.ads.zzalv
            r3.<init>()
            return r3
        L67:
            com.google.android.gms.internal.ads.zzalh r0 = new com.google.android.gms.internal.ads.zzalh
            java.util.List r3 = r3.zzq
            r0.<init>(r3)
            return r0
        L6f:
            com.google.android.gms.internal.ads.zzalj r3 = new com.google.android.gms.internal.ads.zzalj
            r3.<init>()
            return r3
        L75:
            com.google.android.gms.internal.ads.zzama r0 = new com.google.android.gms.internal.ads.zzama
            java.util.List r3 = r3.zzq
            r0.<init>(r3)
            return r0
        L7d:
            com.google.android.gms.internal.ads.zzalp r3 = new com.google.android.gms.internal.ads.zzalp
            r3.<init>()
            return r3
        L83:
            com.google.android.gms.internal.ads.zzamb r3 = new com.google.android.gms.internal.ads.zzamb
            r3.<init>()
            return r3
        L89:
            com.google.android.gms.internal.ads.zzamm r3 = new com.google.android.gms.internal.ads.zzamm
            r3.<init>()
            return r3
        L8f:
            com.google.android.gms.internal.ads.zzall r0 = new com.google.android.gms.internal.ads.zzall
            java.util.List r3 = r3.zzq
            r0.<init>(r3)
            return r0
        L97:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final boolean zzc(com.google.android.gms.internal.ads.zzaf r2) {
            r1 = this;
            java.lang.String r2 = r2.zzn
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "text/vtt"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "application/pgs"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "application/ttml+xml"
            boolean r2 = java.util.Objects.equals(r2, r0)
            if (r2 == 0) goto L43
            goto L45
        L43:
            r2 = 0
            return r2
        L45:
            r2 = 1
            return r2
    }
}
