
/*
 * Copyright 1999-2002 Carnegie Mellon University.  
 * Portions Copyright 2002 Sun Microsystems, Inc.  
 * Portions Copyright 2002 Mitsubishi Electronic Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 * 
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL 
 * WARRANTIES.
 *
 */

package edu.cmu.sphinx.decoder.scorer;

import edu.cmu.sphinx.frontend.FrontEnd;

import java.util.List;

/**
 * Provides a mechanism for scoring a set of HMM states
 *
 */
public interface AcousticScorer {


    /**
     * Initializes this AcousticScorer with the given FrontEnd.
     *
     * @param context the context to use
     * @param frontend the FrontEnd to use
     */
    public void initialize(String context, FrontEnd frontend);


    /**
     * starts the scorer
     */
    public void start();

    /**
     * Scores the given set of states
     *
     * @param scorableList a list containing Scorable objects to
     * be scored
     *
     * @return the best scoring scorable, or null if there are no
     * more frames to score
     */
    public Scoreable calculateScores(List scorableList);

    /**
     * stops the scorer
     */
    public void stop();
}


