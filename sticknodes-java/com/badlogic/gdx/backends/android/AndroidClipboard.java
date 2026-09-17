package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidClipboard implements com.badlogic.gdx.utils.Clipboard {
    private final android.content.ClipboardManager clipboard;

    public AndroidClipboard(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.clipboard = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Clipboard
    public java.lang.String getContents() {
            r3 = this;
            android.content.ClipboardManager r0 = r3.clipboard
            android.content.ClipData r0 = r0.getPrimaryClip()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r2 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r2)
            java.lang.CharSequence r0 = r0.getText()
            if (r0 != 0) goto L16
            return r1
        L16:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean hasContents() {
            r1 = this;
            android.content.ClipboardManager r0 = r1.clipboard
            boolean r0 = r0.hasPrimaryClip()
            return r0
    }

    @Override // com.badlogic.gdx.utils.Clipboard
    public void setContents(java.lang.String r2) {
            r1 = this;
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r2, r2)
            android.content.ClipboardManager r0 = r1.clipboard
            r0.setPrimaryClip(r2)
            return
    }
}
