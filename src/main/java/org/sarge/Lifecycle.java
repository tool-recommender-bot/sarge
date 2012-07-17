package org.sarge;

/**
 * Lifecycle related types.
 * 
 * @author Jonathan Halterman
 */
public final class Lifecycle {
  private Lifecycle() {
  }

  public interface PreRetry {
    void preRetry(Throwable reason);
  }
}
