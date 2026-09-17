package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzalr {
    private static final java.util.regex.Pattern zzd = null;
    private static final com.google.android.gms.internal.ads.zzgbc zze = null;
    private static final com.google.android.gms.internal.ads.zzgbc zzf = null;
    private static final com.google.android.gms.internal.ads.zzgbc zzg = null;
    private static final com.google.android.gms.internal.ads.zzgbc zzh = null;
    public final int zza;
    public final int zzb;
    public final int zzc;

    static {
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalr.zzd = r0
            java.lang.String r0 = "auto"
            java.lang.String r1 = "none"
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzp(r0, r1)
            com.google.android.gms.internal.ads.zzalr.zze = r0
            java.lang.String r0 = "dot"
            java.lang.String r1 = "sesame"
            java.lang.String r2 = "circle"
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzq(r0, r1, r2)
            com.google.android.gms.internal.ads.zzalr.zzf = r0
            java.lang.String r0 = "filled"
            java.lang.String r1 = "open"
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzp(r0, r1)
            com.google.android.gms.internal.ads.zzalr.zzg = r0
            java.lang.String r0 = "after"
            java.lang.String r1 = "before"
            java.lang.String r2 = "outside"
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzq(r0, r1, r2)
            com.google.android.gms.internal.ads.zzalr.zzh = r0
            return
    }

    private zzalr(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzalr zza(java.lang.String r8) {
            if (r8 != 0) goto L4
            goto L102
        L4:
            java.lang.String r8 = r8.trim()
            java.lang.String r8 = com.google.android.gms.internal.ads.zzfxi.zza(r8)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L102
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzalr.zzd
            java.lang.String[] r8 = android.text.TextUtils.split(r8, r0)
            com.google.android.gms.internal.ads.zzgbc r8 = com.google.android.gms.internal.ads.zzgbc.zzm(r8)
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzalr.zzh
            com.google.android.gms.internal.ads.zzgcy r0 = com.google.android.gms.internal.ads.zzgcz.zzb(r0, r8)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgbd.zza(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r2 == r3) goto L46
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L3c
            goto L4e
        L3c:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            r0 = 0
            goto L4f
        L46:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = -1
        L4f:
            r1 = 2
            if (r0 == 0) goto L58
            if (r0 == r5) goto L56
            r0 = 1
            goto L59
        L56:
            r0 = -2
            goto L59
        L58:
            r0 = 2
        L59:
            com.google.android.gms.internal.ads.zzgbc r2 = com.google.android.gms.internal.ads.zzalr.zze
            com.google.android.gms.internal.ads.zzgcy r2 = com.google.android.gms.internal.ads.zzgcz.zzb(r2, r8)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L8b
            java.util.Iterator r8 = r2.iterator()
            java.lang.Object r8 = r8.next()
            java.lang.String r8 = (java.lang.String) r8
            int r1 = r8.hashCode()
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L79
            goto L83
        L79:
            java.lang.String r1 = "none"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L83
            r8 = 0
            goto L84
        L83:
            r8 = -1
        L84:
            if (r8 == 0) goto L88
            goto Lfc
        L88:
            r4 = 0
            goto Lfc
        L8b:
            com.google.android.gms.internal.ads.zzgbc r2 = com.google.android.gms.internal.ads.zzalr.zzg
            com.google.android.gms.internal.ads.zzgcy r2 = com.google.android.gms.internal.ads.zzgcz.zzb(r2, r8)
            com.google.android.gms.internal.ads.zzgbc r3 = com.google.android.gms.internal.ads.zzalr.zzf
            com.google.android.gms.internal.ads.zzgcy r8 = com.google.android.gms.internal.ads.zzgcz.zzb(r3, r8)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto La4
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto La4
            goto Lfc
        La4:
            java.lang.String r3 = "filled"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzgbd.zza(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r7 = 3417674(0x34264a, float:4.789181E-39)
            if (r3 == r7) goto Lb6
            goto Lc0
        Lb6:
            java.lang.String r3 = "open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lc0
            r2 = 0
            goto Lc1
        Lc0:
            r2 = -1
        Lc1:
            if (r2 == 0) goto Lc5
            r2 = 1
            goto Lc6
        Lc5:
            r2 = 2
        Lc6:
            java.lang.String r3 = "circle"
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzgbd.zza(r8, r3)
            java.lang.String r8 = (java.lang.String) r8
            int r3 = r8.hashCode()
            r7 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r3 == r7) goto Le7
            r7 = 99657(0x18549, float:1.39649E-40)
            if (r3 == r7) goto Ldd
            goto Lf0
        Ldd:
            java.lang.String r3 = "dot"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto Lf0
            r4 = 0
            goto Lf0
        Le7:
            java.lang.String r3 = "sesame"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto Lf0
            r4 = 1
        Lf0:
            if (r4 == 0) goto Lfa
            if (r4 == r5) goto Lf7
            r6 = r2
            r4 = 1
            goto Lfc
        Lf7:
            r4 = 3
            r6 = r2
            goto Lfc
        Lfa:
            r6 = r2
            r4 = 2
        Lfc:
            com.google.android.gms.internal.ads.zzalr r8 = new com.google.android.gms.internal.ads.zzalr
            r8.<init>(r4, r6, r0)
            return r8
        L102:
            r8 = 0
            return r8
    }
}
