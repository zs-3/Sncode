package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamm implements com.google.android.gms.internal.ads.zzakv {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzamc zzb;

    public zzamm() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.internal.ads.zzamc r0 = new com.google.android.gms.internal.ads.zzamc
            r0.<init>()
            r1.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.zzaku r11, com.google.android.gms.internal.ads.zzdn r12) {
            r7 = this;
            int r10 = r10 + r9
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            r0.zzJ(r8, r10)
            com.google.android.gms.internal.ads.zzek r8 = r7.zza
            r8.zzL(r9)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.android.gms.internal.ads.zzek r9 = r7.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            int r10 = r9.zzd()     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            java.lang.String r0 = r9.zzz(r0)     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            if (r0 == 0) goto Lb5
            java.lang.String r1 = "WEBVTT"
            boolean r0 = r0.startsWith(r1)     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            if (r0 == 0) goto Lb5
        L26:
            com.google.android.gms.internal.ads.zzek r9 = r7.zza
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = r9.zzz(r10)
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L26
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L39:
            com.google.android.gms.internal.ads.zzek r10 = r7.zza
            r0 = 2
            r1 = 1
            r2 = -1
            r3 = 0
            r4 = -1
            r5 = 0
        L41:
            if (r4 != r2) goto L67
            int r5 = r10.zzd()
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r4 = r10.zzz(r4)
            if (r4 != 0) goto L51
            r4 = 0
            goto L41
        L51:
            java.lang.String r6 = "STYLE"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L5b
            r4 = 2
            goto L41
        L5b:
            java.lang.String r6 = "NOTE"
            boolean r4 = r4.startsWith(r6)
            if (r4 == 0) goto L65
            r4 = 1
            goto L41
        L65:
            r4 = 3
            goto L41
        L67:
            r10.zzL(r5)
            if (r4 == 0) goto Lac
            if (r4 != r1) goto L7d
            com.google.android.gms.internal.ads.zzek r10 = r7.zza
        L70:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r10.zzz(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L39
            goto L70
        L7d:
            if (r4 != r0) goto La0
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L98
            com.google.android.gms.internal.ads.zzek r10 = r7.zza
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r10.zzz(r0)
            com.google.android.gms.internal.ads.zzamc r10 = r7.zzb
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            java.util.List r10 = r10.zzb(r0)
            r8.addAll(r10)
            goto L39
        L98:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "A style block was found after the first cue."
            r8.<init>(r9)
            throw r8
        La0:
            com.google.android.gms.internal.ads.zzek r10 = r7.zza
            com.google.android.gms.internal.ads.zzame r10 = com.google.android.gms.internal.ads.zzaml.zzc(r10, r8)
            if (r10 == 0) goto L39
            r9.add(r10)
            goto L39
        Lac:
            com.google.android.gms.internal.ads.zzamp r8 = new com.google.android.gms.internal.ads.zzamp
            r8.<init>(r9)
            com.google.android.gms.internal.ads.zzakp.zza(r8, r11, r12)
            return
        Lb5:
            r9.zzL(r10)     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            java.lang.String r8 = r9.zzz(r8)     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            java.lang.String r9 = "Expected WEBVTT. Got "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            java.lang.String r8 = r9.concat(r8)     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            r9 = 0
            com.google.android.gms.internal.ads.zzbo r8 = com.google.android.gms.internal.ads.zzbo.zza(r8, r9)     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
            throw r8     // Catch: com.google.android.gms.internal.ads.zzbo -> Lce
        Lce:
            r8 = move-exception
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r8)
            throw r9
    }
}
