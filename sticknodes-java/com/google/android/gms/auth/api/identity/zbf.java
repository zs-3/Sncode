package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbf implements android.os.Parcelable.Creator {
    public zbf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r9 = r6
            r10 = r9
            r7 = 0
            r8 = 0
            r11 = 0
        Le:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L5f
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L55;
                case 2: goto L4b;
                case 3: goto L46;
                case 4: goto L41;
                case 5: goto L3c;
                case 6: goto L32;
                case 7: goto L28;
                case 8: goto L23;
                default: goto L1f;
            }
        L1f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Le
        L23:
            boolean r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto Le
        L28:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions> r2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r10 = r1
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r10 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions) r10
            goto Le
        L32:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions> r2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r9 = r1
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r9 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) r9
            goto Le
        L3c:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto Le
        L41:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto Le
        L46:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Le
        L4b:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions> r2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r5 = r1
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r5 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) r5
            goto Le
        L55:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions> r2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r4 = r1
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r4 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) r4
            goto Le
        L5f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.auth.api.identity.BeginSignInRequest r13 = new com.google.android.gms.auth.api.identity.BeginSignInRequest
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.auth.api.identity.BeginSignInRequest[] r1 = new com.google.android.gms.auth.api.identity.BeginSignInRequest[r1]
            return r1
    }
}
