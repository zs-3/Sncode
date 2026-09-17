package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public abstract class UserAction implements com.badlogic.gdx.utils.Disposable, com.badlogic.gdx.utils.Pool.Poolable {
    public UserAction() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void redo();

    public abstract void undo();
}
