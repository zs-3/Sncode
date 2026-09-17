package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: EncryptedTopic.kt */
/* loaded from: classes.dex */
public final class EncryptedTopic {
    private final byte[] encapsulatedKey;
    private final byte[] encryptedTopic;
    private final java.lang.String keyIdentifier;

    public EncryptedTopic(byte[] r2, java.lang.String r3, byte[] r4) {
            r1 = this;
            java.lang.String r0 = "encryptedTopic"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "keyIdentifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "encapsulatedKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.encryptedTopic = r2
            r1.keyIdentifier = r3
            r1.encapsulatedKey = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.privacysandbox.ads.adservices.topics.EncryptedTopic
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            byte[] r1 = r4.encryptedTopic
            androidx.privacysandbox.ads.adservices.topics.EncryptedTopic r5 = (androidx.privacysandbox.ads.adservices.topics.EncryptedTopic) r5
            byte[] r3 = r5.encryptedTopic
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.keyIdentifier
            java.lang.String r3 = r5.keyIdentifier
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L2b
            byte[] r1 = r4.encapsulatedKey
            byte[] r5 = r5.encapsulatedKey
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L2b
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte[] r1 = r3.encryptedTopic
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.keyIdentifier
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.encapsulatedKey
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EncryptedTopic="
            r0.append(r1)
            byte[] r1 = r3.encryptedTopic
            java.lang.String r1 = kotlin.text.StringsKt.decodeToString(r1)
            r0.append(r1)
            java.lang.String r1 = ", KeyIdentifier="
            r0.append(r1)
            java.lang.String r1 = r3.keyIdentifier
            r0.append(r1)
            java.lang.String r1 = ", EncapsulatedKey="
            r0.append(r1)
            byte[] r1 = r3.encapsulatedKey
            java.lang.String r1 = kotlin.text.StringsKt.decodeToString(r1)
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "EncryptedTopic { "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
