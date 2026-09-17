package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzoq {
    private final java.util.Map zza;

    zzoq(java.util.Map r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            r0.putAll(r2)
            return
    }

    private final int zzf() {
            r3 = this;
            r0 = -1
            java.util.Map r1 = r3.zza     // Catch: java.lang.NumberFormatException -> L15
            java.lang.String r2 = "PolicyVersion"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.NumberFormatException -> L15
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L15
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.NumberFormatException -> L15
            if (r2 != 0) goto L15
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L15
        L15:
            return r0
    }

    private final android.os.Bundle zzg() {
            r10 = this;
            java.util.Map r0 = r10.zza
            java.lang.String r1 = "GoogleConsent"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r2 = "1"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L12
            goto L86
        L12:
            int r1 = r10.zzf()
            if (r1 < 0) goto L86
            java.lang.String r2 = "PurposeConsents"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L86
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            int r3 = r0.length()
            r4 = 0
            java.lang.String r5 = "granted"
            java.lang.String r6 = "denied"
            r7 = 49
            if (r3 <= 0) goto L48
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zza
            java.lang.String r3 = r3.zze
            char r8 = r0.charAt(r4)
            if (r8 != r7) goto L44
            r8 = r5
            goto L45
        L44:
            r8 = r6
        L45:
            r2.putString(r3, r8)
        L48:
            int r3 = r0.length()
            r8 = 3
            if (r3 <= r8) goto L66
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zzd
            java.lang.String r3 = r3.zze
            r9 = 2
            char r9 = r0.charAt(r9)
            if (r9 != r7) goto L62
            char r8 = r0.charAt(r8)
            if (r8 != r7) goto L62
            r8 = r5
            goto L63
        L62:
            r8 = r6
        L63:
            r2.putString(r3, r8)
        L66:
            int r3 = r0.length()
            r8 = 6
            if (r3 <= r8) goto L85
            r3 = 4
            if (r1 < r3) goto L85
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzc
            java.lang.String r1 = r1.zze
            char r3 = r0.charAt(r4)
            if (r3 != r7) goto L81
            char r0 = r0.charAt(r8)
            if (r0 != r7) goto L81
            goto L82
        L81:
            r5 = r6
        L82:
            r2.putString(r1, r5)
        L85:
            return r2
        L86:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.measurement.internal.zzoq
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.measurement.internal.zzoq r2 = (com.google.android.gms.measurement.internal.zzoq) r2
            java.lang.String r0 = r1.zze()
            java.lang.String r2 = r2.zze()
            boolean r2 = r0.equalsIgnoreCase(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zze()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zze()
            return r0
    }

    public final android.os.Bundle zza() {
            r9 = this;
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzbj
            r1 = 0
            java.lang.Object r2 = r0.zza(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "EnableAdvertiserConsentMode"
            java.lang.String r4 = "gdprApplies"
            java.lang.String r5 = "1"
            if (r2 == 0) goto L2c
            java.util.Map r2 = r9.zza
            java.lang.Object r4 = r2.get(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lde
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lde
            goto L4e
        L2c:
            java.util.Map r2 = r9.zza
            java.lang.String r6 = "GoogleConsent"
            java.lang.Object r6 = r2.get(r6)
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Lde
            java.lang.Object r4 = r2.get(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lde
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lde
        L4e:
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld9
            java.util.Map r0 = r9.zza
            java.lang.String r1 = "Version"
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L69
            android.os.Bundle r0 = r9.zzg()
            return r0
        L69:
            int r1 = r9.zzf()
            if (r1 >= 0) goto L71
            goto Lde
        L71:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zza
            java.lang.String r2 = r2.zze
            r3 = 1
            java.lang.String r4 = "AuthorizePurpose1"
            java.lang.Object r6 = r0.get(r4)
            boolean r6 = java.util.Objects.equals(r6, r5)
            java.lang.String r7 = "denied"
            java.lang.String r8 = "granted"
            if (r3 == r6) goto L8d
            r3 = r7
            goto L8e
        L8d:
            r3 = r8
        L8e:
            r1.putString(r2, r3)
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zzd
            java.lang.String r2 = r2.zze
            java.lang.String r3 = "AuthorizePurpose3"
            java.lang.Object r3 = r0.get(r3)
            boolean r3 = java.util.Objects.equals(r3, r5)
            if (r3 == 0) goto Laf
            java.lang.String r3 = "AuthorizePurpose4"
            java.lang.Object r3 = r0.get(r3)
            boolean r3 = java.util.Objects.equals(r3, r5)
            if (r3 == 0) goto Laf
            r3 = r8
            goto Lb0
        Laf:
            r3 = r7
        Lb0:
            r1.putString(r2, r3)
            int r2 = r9.zzf()
            r3 = 4
            if (r2 < r3) goto Ld8
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zzc
            java.lang.String r2 = r2.zze
            java.lang.Object r3 = r0.get(r4)
            boolean r3 = java.util.Objects.equals(r3, r5)
            if (r3 == 0) goto Ld5
            java.lang.String r3 = "AuthorizePurpose7"
            java.lang.Object r0 = r0.get(r3)
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 == 0) goto Ld5
            r7 = r8
        Ld5:
            r1.putString(r2, r7)
        Ld8:
            return r1
        Ld9:
            android.os.Bundle r0 = r9.zzg()
            return r0
        Lde:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            return r0
    }

    public final java.lang.String zzb() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.String r1 = "PurposeDiagnostics"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L12
            java.lang.String r0 = "200000"
        L12:
            return r0
    }

    public final java.lang.String zzc(com.google.android.gms.measurement.internal.zzoq r8) {
            r7 = this;
            java.util.Map r0 = r8.zza
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "1"
            java.lang.String r3 = "0"
            if (r1 != 0) goto L18
            java.lang.String r1 = "Version"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r3
        L19:
            android.os.Bundle r1 = r7.zza()
            android.os.Bundle r8 = r8.zza()
            int r4 = r1.size()
            int r5 = r8.size()
            r6 = 1
            if (r4 == r5) goto L2e
        L2c:
            r8 = 1
            goto L62
        L2e:
            java.lang.String r4 = "ad_storage"
            java.lang.String r5 = r1.getString(r4)
            java.lang.String r4 = r8.getString(r4)
            boolean r4 = java.util.Objects.equals(r5, r4)
            if (r4 != 0) goto L3f
            goto L2c
        L3f:
            java.lang.String r4 = "ad_personalization"
            java.lang.String r5 = r1.getString(r4)
            java.lang.String r4 = r8.getString(r4)
            boolean r4 = java.util.Objects.equals(r5, r4)
            if (r4 != 0) goto L50
            goto L2c
        L50:
            java.lang.String r4 = "ad_user_data"
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r8 = r8.getString(r4)
            boolean r8 = java.util.Objects.equals(r1, r8)
            if (r8 != 0) goto L61
            goto L2c
        L61:
            r8 = 0
        L62:
            if (r6 == r8) goto L65
            r2 = r3
        L65:
            java.lang.String r8 = r0.concat(r2)
            return r8
    }

    public final java.lang.String zzd() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "1"
            r0.append(r1)
            r2 = -1
            java.util.Map r3 = r6.zza     // Catch: java.lang.NumberFormatException -> L20
            java.lang.String r4 = "CmpSdkID"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.NumberFormatException -> L20
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L20
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.NumberFormatException -> L20
            if (r4 != 0) goto L21
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L20
            goto L21
        L20:
        L21:
            r3 = 63
            java.lang.String r4 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_"
            if (r2 < 0) goto L3d
            r5 = 4095(0xfff, float:5.738E-42)
            if (r2 > r5) goto L3d
            int r5 = r2 >> 6
            char r5 = r4.charAt(r5)
            r0.append(r5)
            r2 = r2 & r3
            char r2 = r4.charAt(r2)
            r0.append(r2)
            goto L42
        L3d:
            java.lang.String r2 = "00"
            r0.append(r2)
        L42:
            int r2 = r6.zzf()
            if (r2 < 0) goto L52
            if (r2 > r3) goto L52
            char r2 = r4.charAt(r2)
            r0.append(r2)
            goto L57
        L52:
            java.lang.String r2 = "0"
            r0.append(r2)
        L57:
            r2 = 1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            java.util.Map r3 = r6.zza
            java.lang.String r5 = "gdprApplies"
            java.lang.Object r5 = r3.get(r5)
            boolean r5 = r1.equals(r5)
            if (r2 == r5) goto L6b
            r2 = 0
            goto L6c
        L6b:
            r2 = 2
        L6c:
            java.lang.String r5 = "EnableAdvertiserConsentMode"
            java.lang.Object r3 = r3.get(r5)
            boolean r1 = r1.equals(r3)
            r2 = r2 | 4
            if (r1 == 0) goto L7c
            r2 = r2 | 8
        L7c:
            char r1 = r4.charAt(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    final java.lang.String zze() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.common.collect.ImmutableList r1 = com.google.android.gms.measurement.internal.zzot.zza
            int r2 = r1.size()
            r3 = 0
        Lc:
            if (r3 >= r2) goto L3c
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map r5 = r7.zza
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L1d
            goto L39
        L1d:
            int r6 = r0.length()
            if (r6 <= 0) goto L28
            java.lang.String r6 = ";"
            r0.append(r6)
        L28:
            r0.append(r4)
            java.lang.String r6 = "="
            r0.append(r6)
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
        L39:
            int r3 = r3 + 1
            goto Lc
        L3c:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
