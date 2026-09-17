package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamb implements com.google.android.gms.internal.ads.zzakv {
    private final com.google.android.gms.internal.ads.zzek zza;

    public zzamb() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r10, int r11, int r12, com.google.android.gms.internal.ads.zzaku r13, com.google.android.gms.internal.ads.zzdn r14) {
            r9 = this;
            int r12 = r12 + r11
            com.google.android.gms.internal.ads.zzek r13 = r9.zza
            r13.zzJ(r10, r12)
            com.google.android.gms.internal.ads.zzek r10 = r9.zza
            r10.zzL(r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L10:
            com.google.android.gms.internal.ads.zzek r10 = r9.zza
            int r11 = r10.zzb()
            if (r11 <= 0) goto Lad
            int r10 = r10.zzb()
            r11 = 1
            r12 = 0
            r13 = 8
            if (r10 < r13) goto L24
            r10 = 1
            goto L25
        L24:
            r10 = 0
        L25:
            java.lang.String r0 = "Incomplete Mp4Webvtt Top Level box header found."
            com.google.android.gms.internal.ads.zzdi.zze(r10, r0)
            com.google.android.gms.internal.ads.zzek r10 = r9.zza
            int r0 = r10.zzg()
            int r0 = r0 + (-8)
            int r10 = r10.zzg()
            r2 = 1987343459(0x76747463, float:1.2395323E33)
            if (r10 != r2) goto La6
            com.google.android.gms.internal.ads.zzek r10 = r9.zza
            r2 = 0
            r3 = r2
            r4 = r3
        L40:
            if (r0 <= 0) goto L84
            if (r0 < r13) goto L46
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            java.lang.String r6 = "Incomplete vtt cue box header found."
            com.google.android.gms.internal.ads.zzdi.zze(r5, r6)
            int r5 = r10.zzg()
            int r6 = r10.zzg()
            int r0 = r0 + (-8)
            int r5 = r5 + (-8)
            byte[] r7 = r10.zzN()
            int r8 = r10.zzd()
            java.lang.String r7 = com.google.android.gms.internal.ads.zzeu.zzB(r7, r8, r5)
            r10.zzM(r5)
            r8 = 1937011815(0x73747467, float:1.9367696E31)
            if (r6 != r8) goto L71
            com.google.android.gms.internal.ads.zzcz r4 = com.google.android.gms.internal.ads.zzaml.zzb(r7)
            goto L82
        L71:
            r8 = 1885436268(0x7061796c, float:2.7912367E29)
            if (r6 != r8) goto L82
            java.lang.String r3 = r7.trim()
            java.util.List r6 = java.util.Collections.emptyList()
            android.text.SpannedString r3 = com.google.android.gms.internal.ads.zzaml.zza(r2, r3, r6)
        L82:
            int r0 = r0 - r5
            goto L40
        L84:
            if (r3 != 0) goto L88
            java.lang.String r3 = ""
        L88:
            if (r4 == 0) goto L92
            r4.zzl(r3)
            com.google.android.gms.internal.ads.zzdb r10 = r4.zzp()
            goto La1
        L92:
            com.google.android.gms.internal.ads.zzamk r10 = new com.google.android.gms.internal.ads.zzamk
            r10.<init>()
            r10.zzc = r3
            com.google.android.gms.internal.ads.zzcz r10 = r10.zza()
            com.google.android.gms.internal.ads.zzdb r10 = r10.zzp()
        La1:
            r1.add(r10)
            goto L10
        La6:
            com.google.android.gms.internal.ads.zzek r10 = r9.zza
            r10.zzM(r0)
            goto L10
        Lad:
            com.google.android.gms.internal.ads.zzakn r10 = new com.google.android.gms.internal.ads.zzakn
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r10
            r2 = r4
            r0.<init>(r1, r2, r4)
            r14.zza(r10)
            return
    }
}
