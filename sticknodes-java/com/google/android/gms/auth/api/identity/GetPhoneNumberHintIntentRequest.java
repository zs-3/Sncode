package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GetPhoneNumberHintIntentRequestCreator")
/* loaded from: classes.dex */
public class GetPhoneNumberHintIntentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTheme", id = 1)
    private final int zba;

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    public static final class Builder {
        private Builder() {
                r1 = this;
                r0 = 0
                throw r0
        }

        /* synthetic */ Builder(com.google.android.gms.auth.api.identity.zbi r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest build() {
                r2 = this;
                com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest r0 = new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest
                r1 = 0
                r0.<init>(r1)
                return r0
        }
    }

    static {
            com.google.android.gms.auth.api.identity.zbj r0 = new com.google.android.gms.auth.api.identity.zbj
            r0.<init>()
            com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    GetPhoneNumberHintIntentRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    public static com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.Builder builder() {
            com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest$Builder r0 = new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest r2 = (com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest) r2
            int r0 = r1.zba
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r2.zba
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zba
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zba
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
