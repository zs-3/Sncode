package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class ClientData {
    public static final java.lang.String KEY_CHALLENGE = "challenge";
    public static final java.lang.String KEY_CID_PUBKEY = "cid_pubkey";
    public static final java.lang.String KEY_ORIGIN = "origin";
    public static final java.lang.String KEY_TYPE = "typ";
    public static final java.lang.String TYPE_FINISH_ENROLLMENT = "navigator.id.finishEnrollment";
    public static final java.lang.String TYPE_GET_ASSERTION = "navigator.id.getAssertion";
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class Builder implements java.lang.Cloneable {
        private java.lang.String zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzd;

        Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue r0 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ABSENT
                r1.zzd = r0
                return
        }

        Builder(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.fido.u2f.api.common.ChannelIdValue r4) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                r0.zzc = r3
                r0.zzd = r4
                return
        }

        public static com.google.android.gms.fido.u2f.api.common.ClientData.Builder newInstance() {
                com.google.android.gms.fido.u2f.api.common.ClientData$Builder r0 = new com.google.android.gms.fido.u2f.api.common.ClientData$Builder
                r0.<init>()
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData build() {
                r5 = this;
                com.google.android.gms.fido.u2f.api.common.ClientData r0 = new com.google.android.gms.fido.u2f.api.common.ClientData
                java.lang.String r1 = r5.zza
                java.lang.String r2 = r5.zzb
                java.lang.String r3 = r5.zzc
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue r4 = r5.zzd
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder clone() {
                r5 = this;
                com.google.android.gms.fido.u2f.api.common.ClientData$Builder r0 = new com.google.android.gms.fido.u2f.api.common.ClientData$Builder
                java.lang.String r1 = r5.zza
                java.lang.String r2 = r5.zzb
                java.lang.String r3 = r5.zzc
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue r4 = r5.zzd
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ java.lang.Object m36clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.google.android.gms.fido.u2f.api.common.ClientData$Builder r0 = r1.clone()
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setChallenge(java.lang.String r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setChannelId(com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setOrigin(java.lang.String r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setType(java.lang.String r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    ClientData(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.fido.u2f.api.common.ChannelIdValue r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zza = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzc = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r1
            r0.zzd = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.ClientData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.fido.u2f.api.common.ClientData r5 = (com.google.android.gms.fido.u2f.api.common.ClientData) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.zzd
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r5 = r5.zzd
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L35
            return r0
        L35:
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zza
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            java.lang.String r1 = r2.zzb
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            java.lang.String r1 = r2.zzc
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r2.zzd
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toJsonString() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "typ"
            java.lang.String r2 = r4.zza     // Catch: org.json.JSONException -> L47
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L47
            java.lang.String r1 = "challenge"
            java.lang.String r2 = r4.zzb     // Catch: org.json.JSONException -> L47
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L47
            java.lang.String r1 = "origin"
            java.lang.String r2 = r4.zzc     // Catch: org.json.JSONException -> L47
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L47
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.ABSENT     // Catch: org.json.JSONException -> L47
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.zzd     // Catch: org.json.JSONException -> L47
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = r1.getType()     // Catch: org.json.JSONException -> L47
            int r1 = r1.ordinal()     // Catch: org.json.JSONException -> L47
            r2 = 1
            java.lang.String r3 = "cid_pubkey"
            if (r1 == r2) goto L39
            r2 = 2
            if (r1 == r2) goto L2f
            goto L42
        L2f:
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.zzd     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r1 = r1.getObjectValue()     // Catch: org.json.JSONException -> L47
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L47
            goto L42
        L39:
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.zzd     // Catch: org.json.JSONException -> L47
            java.lang.String r1 = r1.getStringValue()     // Catch: org.json.JSONException -> L47
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L47
        L42:
            java.lang.String r0 = r0.toString()
            return r0
        L47:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
