package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzck {
    public java.lang.String zza;
    public java.lang.String zzb;
    public java.lang.String zzc;
    public java.util.List zzd;
    public java.util.List zze;
    public int zzf;
    public int zzg;

    public zzck() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.zzf = r0
            java.util.List r1 = java.util.Collections.emptyList()
            r2.zzd = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r2.zze = r1
            r2.zzg = r0
            return
    }

    public static com.google.android.gms.internal.consent_sdk.zzck zza(android.util.JsonReader r12) throws java.io.IOException {
            com.google.android.gms.internal.consent_sdk.zzck r0 = new com.google.android.gms.internal.consent_sdk.zzck
            r0.<init>()
            r12.beginObject()
        L8:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L22b
            java.lang.String r1 = r12.nextName()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 5
            r5 = 6
            r6 = 3
            r7 = 0
            r8 = -1
            r9 = 2
            r10 = 1
            switch(r2) {
                case -2001388947: goto L5e;
                case -1938755376: goto L54;
                case -1851537225: goto L4a;
                case -1324537865: goto L40;
                case -1161803523: goto L36;
                case -986806987: goto L2c;
                case -790907624: goto L22;
                default: goto L21;
            }
        L21:
            goto L68
        L22:
            java.lang.String r2 = "consent_form_payload"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            r1 = 1
            goto L69
        L2c:
            java.lang.String r2 = "request_info_keys"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            r1 = 4
            goto L69
        L36:
            java.lang.String r2 = "actions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            r1 = 5
            goto L69
        L40:
            java.lang.String r2 = "privacy_options_required"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            r1 = 6
            goto L69
        L4a:
            java.lang.String r2 = "consent_form_base_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            r1 = 2
            goto L69
        L54:
            java.lang.String r2 = "error_message"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            r1 = 3
            goto L69
        L5e:
            java.lang.String r2 = "consent_signal"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            r1 = 0
            goto L69
        L68:
            r1 = -1
        L69:
            switch(r1) {
                case 0: goto L1ad;
                case 1: goto L1a5;
                case 2: goto L19d;
                case 3: goto L195;
                case 4: goto L176;
                case 5: goto Lc0;
                case 6: goto L70;
                default: goto L6c;
            }
        L6c:
            r12.skipValue()
            goto L8
        L70:
            java.lang.String r1 = r12.nextString()
            int r2 = r1.hashCode()
            r3 = -1888946261(0xffffffff8f68f7ab, float:-1.1486182E-29)
            if (r2 == r3) goto L9b
            r3 = 389487519(0x17371b9f, float:5.916535E-25)
            if (r2 == r3) goto L91
            r3 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r2 == r3) goto L88
            goto La5
        L88:
            java.lang.String r2 = "UNKNOWN"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            goto La6
        L91:
            java.lang.String r2 = "REQUIRED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r7 = 1
            goto La6
        L9b:
            java.lang.String r2 = "NOT_REQUIRED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r7 = 2
            goto La6
        La5:
            r7 = -1
        La6:
            if (r7 == 0) goto Lbb
            if (r7 == r10) goto Lb9
            if (r7 != r9) goto Lad
            goto Lbc
        Lad:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: "
            java.lang.String r0 = r0.concat(r1)
            r12.<init>(r0)
            throw r12
        Lb9:
            r6 = 2
            goto Lbc
        Lbb:
            r6 = 1
        Lbc:
            r0.zzg = r6
            goto L8
        Lc0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zze = r1
            r12.beginArray()
        Lca:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L171
            com.google.android.gms.internal.consent_sdk.zzcj r1 = new com.google.android.gms.internal.consent_sdk.zzcj
            r1.<init>()
            r12.beginObject()
        Ld8:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L167
            java.lang.String r2 = r12.nextName()
            int r3 = r2.hashCode()
            r4 = -2105551094(0xffffffff827fd70a, float:-1.8796154E-37)
            if (r3 == r4) goto Lfb
            r4 = 1583758243(0x5e663ba3, float:4.14750822E18)
            if (r3 == r4) goto Lf1
            goto L105
        Lf1:
            java.lang.String r3 = "action_type"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L105
            r2 = 0
            goto L106
        Lfb:
            java.lang.String r3 = "args_json"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L105
            r2 = 1
            goto L106
        L105:
            r2 = -1
        L106:
            if (r2 == 0) goto L115
            if (r2 == r10) goto L10e
            r12.skipValue()
            goto Ld8
        L10e:
            java.lang.String r2 = r12.nextString()
            r1.zza = r2
            goto Ld8
        L115:
            java.lang.String r2 = r12.nextString()
            int r3 = r2.hashCode()
            r4 = 64208429(0x3d3be2d, float:1.2445128E-36)
            if (r3 == r4) goto L141
            r4 = 82862015(0x4f05fbf, float:5.6511658E-36)
            if (r3 == r4) goto L137
            r4 = 1856333582(0x6ea5670e, float:2.5594806E28)
            if (r3 == r4) goto L12d
            goto L14b
        L12d:
            java.lang.String r3 = "UNKNOWN_ACTION_TYPE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L14b
            r3 = 0
            goto L14c
        L137:
            java.lang.String r3 = "WRITE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L14b
            r3 = 1
            goto L14c
        L141:
            java.lang.String r3 = "CLEAR"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L14b
            r3 = 2
            goto L14c
        L14b:
            r3 = -1
        L14c:
            if (r3 == 0) goto L162
            if (r3 == r10) goto L160
            if (r3 != r9) goto L154
            r2 = 3
            goto L163
        L154:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: "
            java.lang.String r0 = r0.concat(r2)
            r12.<init>(r0)
            throw r12
        L160:
            r2 = 2
            goto L163
        L162:
            r2 = 1
        L163:
            r1.zzb = r2
            goto Ld8
        L167:
            r12.endObject()
            java.util.List r2 = r0.zze
            r2.add(r1)
            goto Lca
        L171:
            r12.endArray()
            goto L8
        L176:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzd = r1
            r12.beginArray()
        L180:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L190
            java.lang.String r1 = r12.nextString()
            java.util.List r2 = r0.zzd
            r2.add(r1)
            goto L180
        L190:
            r12.endArray()
            goto L8
        L195:
            java.lang.String r1 = r12.nextString()
            r0.zzc = r1
            goto L8
        L19d:
            java.lang.String r1 = r12.nextString()
            r0.zzb = r1
            goto L8
        L1a5:
            java.lang.String r1 = r12.nextString()
            r0.zza = r1
            goto L8
        L1ad:
            java.lang.String r1 = r12.nextString()
            int r2 = r1.hashCode()
            r11 = 7
            switch(r2) {
                case -2058725357: goto L1ff;
                case -1969035850: goto L1f5;
                case -1263695752: goto L1ec;
                case -954325659: goto L1e2;
                case -918677260: goto L1d8;
                case 429411856: goto L1ce;
                case 467888915: goto L1c4;
                case 1725474845: goto L1ba;
                default: goto L1b9;
            }
        L1b9:
            goto L209
        L1ba:
            java.lang.String r2 = "CONSENT_SIGNAL_NOT_REQUIRED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            r7 = 5
            goto L20a
        L1c4:
            java.lang.String r2 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            r7 = 1
            goto L20a
        L1ce:
            java.lang.String r2 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            r7 = 3
            goto L20a
        L1d8:
            java.lang.String r2 = "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            r7 = 7
            goto L20a
        L1e2:
            java.lang.String r2 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            r7 = 2
            goto L20a
        L1ec:
            java.lang.String r2 = "CONSENT_SIGNAL_UNKNOWN"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            goto L20a
        L1f5:
            java.lang.String r2 = "CONSENT_SIGNAL_ERROR"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            r7 = 6
            goto L20a
        L1ff:
            java.lang.String r2 = "CONSENT_SIGNAL_COLLECT_CONSENT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L209
            r7 = 4
            goto L20a
        L209:
            r7 = -1
        L20a:
            switch(r7) {
                case 0: goto L226;
                case 1: goto L224;
                case 2: goto L222;
                case 3: goto L227;
                case 4: goto L220;
                case 5: goto L21e;
                case 6: goto L21c;
                case 7: goto L219;
                default: goto L20d;
            }
        L20d:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: "
            java.lang.String r0 = r0.concat(r1)
            r12.<init>(r0)
            throw r12
        L219:
            r3 = 8
            goto L227
        L21c:
            r3 = 7
            goto L227
        L21e:
            r3 = 6
            goto L227
        L220:
            r3 = 5
            goto L227
        L222:
            r3 = 3
            goto L227
        L224:
            r3 = 2
            goto L227
        L226:
            r3 = 1
        L227:
            r0.zzf = r3
            goto L8
        L22b:
            r12.endObject()
            return r0
    }
}
