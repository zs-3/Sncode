package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzx {
    private final com.google.android.gms.measurement.internal.zzio zza;

    public zzx(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    final void zza(java.lang.String r5, android.os.Bundle r6) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            boolean r1 = r0.zzJ()
            if (r1 != 0) goto L6c
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L17
            r5 = 0
            goto L4c
        L17:
            r1 = 1
            boolean r2 = r5.isEmpty()
            if (r1 != r2) goto L20
            java.lang.String r5 = "auto"
        L20:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            r1.path(r5)
            java.util.Set r5 = r6.keySet()
            java.util.Iterator r5 = r5.iterator()
        L30:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r6.getString(r2)
            r1.appendQueryParameter(r2, r3)
            goto L30
        L44:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
        L4c:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L6c
            com.google.android.gms.measurement.internal.zzht r6 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhr r6 = r6.zzr
            r6.zzb(r5)
            com.google.android.gms.measurement.internal.zzht r5 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r5 = r5.zzs
            com.google.android.gms.common.util.Clock r6 = r0.zzaU()
            long r0 = r6.currentTimeMillis()
            r5.zzb(r0)
        L6c:
            return
    }

    final void zzb() {
            r13 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r13.zza
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            boolean r1 = r13.zzd()
            if (r1 != 0) goto L10
            return
        L10:
            boolean r1 = r13.zze()
            java.lang.String r2 = "_cc"
            r3 = 0
            if (r1 == 0) goto L4c
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhr r1 = r1.zzr
            r1.zzb(r3)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "(not set)"
            r1.putString(r3, r4)
            java.lang.String r3 = "medium"
            r1.putString(r3, r4)
            java.lang.String r3 = "_cis"
            java.lang.String r4 = "intent"
            r1.putString(r3, r4)
            r3 = 1
            r1.putLong(r2, r3)
            com.google.android.gms.measurement.internal.zzlw r2 = r0.zzq()
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_cmpx"
            r2.zzR(r3, r4, r1)
            goto Ld1
        L4c:
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhr r1 = r1.zzr
            java.lang.String r1 = r1.zza()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L6a
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzh()
            java.lang.String r2 = "Cache still valid but referrer not found"
            r1.zza(r2)
            goto Lc8
        L6a:
            com.google.android.gms.measurement.internal.zzht r4 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r4 = r4.zzs
            long r4 = r4.zza()
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 / r6
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            android.util.Pair r9 = new android.util.Pair
            java.lang.String r10 = r1.getPath()
            r9.<init>(r10, r8)
            java.util.Set r10 = r1.getQueryParameterNames()
            java.util.Iterator r10 = r10.iterator()
        L92:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La6
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r1.getQueryParameter(r11)
            r8.putString(r11, r12)
            goto L92
        La6:
            r10 = -1
            long r4 = r4 + r10
            long r4 = r4 * r6
            java.lang.Object r1 = r9.second
            android.os.Bundle r1 = (android.os.Bundle) r1
            r1.putLong(r2, r4)
            java.lang.Object r1 = r9.first
            if (r1 != 0) goto Lb9
            java.lang.String r1 = "app"
            goto Lbb
        Lb9:
            java.lang.String r1 = (java.lang.String) r1
        Lbb:
            com.google.android.gms.measurement.internal.zzlw r2 = r0.zzq()
            java.lang.Object r4 = r9.second
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "_cmp"
            r2.zzR(r1, r5, r4)
        Lc8:
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhr r1 = r1.zzr
            r1.zzb(r3)
        Ld1:
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r0 = r0.zzs
            r1 = 0
            r0.zzb(r1)
            return
    }

    final void zzc() {
            r2 = this;
            boolean r0 = r2.zzd()
            if (r0 == 0) goto L18
            boolean r0 = r2.zze()
            if (r0 == 0) goto L18
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhr r0 = r0.zzr
            r1 = 0
            r0.zzb(r1)
        L18:
            return
    }

    final boolean zzd() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r5.zza
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r0 = r0.zzs
            long r0 = r0.zza()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    final boolean zze() {
            r6 = this;
            boolean r0 = r6.zzd()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.android.gms.measurement.internal.zzio r0 = r6.zza
            com.google.android.gms.common.util.Clock r2 = r0.zzaU()
            long r2 = r2.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzht r4 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r4 = r4.zzs
            long r4 = r4.zza()
            long r2 = r2 - r4
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            r4 = 0
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzai
            long r4 = r0.zzk(r4, r5)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r0 = 1
            return r0
        L2e:
            return r1
    }
}
